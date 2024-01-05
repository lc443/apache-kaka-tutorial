package com.leron.springbootkafkatutorial.controller;

import com.leron.springbootkafkatutorial.kafka.StringKafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class StringMessageController {

    private StringKafkaProducer stringKafkaProducer;

    public StringMessageController(StringKafkaProducer stringKafkaProducer) {
        this.stringKafkaProducer = stringKafkaProducer;
    }

    //http://localhost:8080/api/v1/kafka?message=hello world
    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message ){
        stringKafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message send tp the topic");
    }
}
