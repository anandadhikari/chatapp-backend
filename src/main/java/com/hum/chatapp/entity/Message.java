package com.hum.chatapp.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private int messageId;

    @ManyToOne
    @JoinColumn(name = "conversation_id")
    private Conversation conversation;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private Chatuser sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private Chatuser receiver;

    @Column(name = "message")
    private String message;

    @Column(name = "timestamp")
    private LocalDateTime timestamp;
}
