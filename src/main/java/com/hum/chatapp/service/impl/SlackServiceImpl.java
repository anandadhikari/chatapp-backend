package com.hum.chatapp.service.impl;

import com.github.seratch.jslack.Slack;
import com.github.seratch.jslack.api.webhook.Payload;
import com.github.seratch.jslack.api.webhook.WebhookResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SlackServiceImpl {

    private static String webHooksUrl;
    private static String slackChannel;

    @Value("${slack.webhook.url}")
    public void setWebHooksUrl(String webHooksUrl) {
        SlackServiceImpl.webHooksUrl = webHooksUrl;
    }

    @Value("${slack.channel.name}")
    public void setSlackChannel(String slackChannel) {
        SlackServiceImpl.slackChannel = slackChannel;
    }

    public static void sendMessageToSlack(String message) {
        try {
            Payload payload = Payload.builder().channel(slackChannel).text(message).build();
            WebhookResponse wbRes = Slack.getInstance().send(webHooksUrl,payload);
        } catch (Exception e){
            sendMessageToSlack(e.getMessage());
        }
    }

}