package com.example.messagelogger.repository;

import com.example.messagelogger.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
