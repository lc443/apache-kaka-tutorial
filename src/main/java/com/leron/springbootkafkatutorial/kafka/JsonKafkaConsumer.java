package com.leron.springbootkafkatutorial.kafka;

import com.leron.springbootkafkatutorial.model.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
    @KafkaListener(topics = "leron_json", groupId = "myGroup")
    public void consume(User user) {
        LOGGER.info(String.format("Json message Received  -> %s", user));
    }
}
