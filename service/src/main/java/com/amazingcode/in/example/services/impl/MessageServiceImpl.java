package com.amazingcode.in.example.services.impl;

import org.springframework.stereotype.Service;

import com.amazingcode.in.example.repositories.MessageRepository;
import com.amazingcode.in.example.services.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

    public MessageServiceImpl(MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }

    @Override
    public String getMessage() {
        return "Message from MessageServiceImpl.java"+"\n"+messageRepository.getMessage();
    }
    
}
