package com.demo.messenger.model;

import org.springframework.data.annotation.Id;

public class Message {
    @Id
    private String id;
    private String sender;
    private String receiver;
    private String msg;
    private String time;

    public Message() {}

    public Message(String from, String to) {
        this.sender = from;
        this.receiver = to;
    }

    public Message(String from, String to, String msg) {
        this.sender = from;
        this.receiver = to;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return String.format(
                "Message[id=%s, from='%s', to='%s']",
                id, sender, receiver);
    }

}
