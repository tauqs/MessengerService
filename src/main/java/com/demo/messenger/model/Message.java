package com.demo.messenger.model;

import org.springframework.data.annotation.Id;

public class Message {
    @Id
    private String id;
    private String from;
    private String to;
    private String time;

    public Message() {}

    public Message(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return String.format(
                "Message[id=%s, from='%s', to='%s']",
                id, from, to);
    }

}
