package com.example.d1023.controller;


import com.example.d1023.service.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/users")
@RestController
public class UserController {
    private final KafkaProducer producer;
    private final KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping
    public String test() {
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