package com.amazingcode.in.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazingcode.in.example.services.MessageService;

@RestController
@RequestMapping("/api/message")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService){
        this.messageService = messageService;
    }
    
    @GetMapping
    ResponseEntity<String> getMessage(){
        return ResponseEntity.ok("Message from MessageController.java"+" "+messageService.getMessage());
    }
}
