package com.leron.springbootkafkatutorial.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class StringKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(StringKafkaConsumer.class);
    @KafkaListener(topics = "leron_topic", groupId = "myGroup")
    public void consume(String message) {
        LOGGER.info(String.format("Message Received  -> %s", message));
    }
}
