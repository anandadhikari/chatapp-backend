package com.hum.chatapp.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "conversation")
public class Conversation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "conversation_id")
    private int conversationId;

    @ManyToOne
    @JoinColumn(name = "user1_id")
    private Chatuser user1;

    @ManyToOne
    @JoinColumn(name = "user2_id")
    private Chatuser user2;
}
