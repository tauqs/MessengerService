package com.demo.messenger.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.demo.messenger.model.Message;

public interface MessageRepository extends MongoRepository<Message, String> {
    public Message findBySender(String sender);
}
