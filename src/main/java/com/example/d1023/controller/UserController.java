package com.example.d1023.controller;


import com.example.d1023.service.KafkaProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/users")
@RestController
@Slf4j
public class UserController {
    private final KafkaProducer producer;
    private final KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping
    public String test() {
        log.error("log~~log~~log~~");
        return "Hello!";
    }

    @PostMapping
    public String sendMessage(@RequestParam("message") String message) {
        this.producer.sendMessage(message);
        return message;
    }

//    @GetMapping("/consumer")
//    public String getMessage(){
//
//    }

    @GetMapping("/123")
    public String getMessage() {
        return this.kafkaTemplate.getDefaultTopic();
    }
}