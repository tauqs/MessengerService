package com.demo.messenger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/messaging")
public class MessageController {
//    @GetMapping(
//            path = "/message",
//            params = {"name"})
//    public Message getMessage(
//            @RequestParam final String name) {
//
//        final Message message = new Message();
//        message.setText("Hello " + name);
//        return message;
//    }

    @GetMapping(path = "/message", params = {"name"})
    public String getMessage(
            @RequestParam final String name) {
        String message = new String();
        message =  "Hello " + name;
        return message;
    }
}
