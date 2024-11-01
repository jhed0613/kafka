package com.example.d1023.controller;


import com.example.d1023.service.KafkaProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
        for (int i=0; i<10; i++) {
            log.debug("log~~log~~log~~ {}", i);
            log.info("~~~~LOG~~~~ {}", i);

            // 커스텀 로거 사용
            Log logger_info = LogFactory.getLog("INFO_LOG");
            logger_info.debug("로그입니다~~~ " + i);
        }
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