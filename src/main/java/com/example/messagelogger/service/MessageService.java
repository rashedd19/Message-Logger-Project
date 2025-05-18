package com.example.messagelogger.service;

import com.example.messagelogger.model.Message;
import com.example.messagelogger.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    private final MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public Message saveMessage(String content) {
        return repository.save(new Message(content));
    }

    public List<Message> getAllMessages() {
        return repository.findAll();
    }

    public void deleteMessage(Long id) {
        repository.deleteById(id);
    }
}
