package com.example.messagelogger.controller;

import com.example.messagelogger.model.Message;
import com.example.messagelogger.service.MessageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    private final MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }

    @PostMapping
    public Message logMessage(@RequestBody String content) {
        return service.saveMessage(content);
    }

    @GetMapping
    public List<Message> getMessages() {
        return service.getAllMessages();
    }

    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable Long id) {
        service.deleteMessage(id);
    }
}
