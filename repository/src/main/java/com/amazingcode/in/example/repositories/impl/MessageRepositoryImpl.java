package com.amazingcode.in.example.repositories.impl;

import org.springframework.stereotype.Repository;

import com.amazingcode.in.example.repositories.MessageRepository;

@Repository
public class MessageRepositoryImpl implements MessageRepository {

    @Override
    public String getMessage() {
        return "Message from MessageRepositoryImpl.java";
    }
    
}
