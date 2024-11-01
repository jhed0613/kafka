package com.example.d1023.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {
    @KafkaListener(topics = "kjh", groupId = "dev")
    public void consume(String message) {
        log.info("수신: {}", message);
    }
}