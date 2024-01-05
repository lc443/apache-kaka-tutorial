package com.leron.springbootkafkatutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    //String topic
    @Bean
    public NewTopic leronTopic(){
        return TopicBuilder.name("leron_topic").build();
    }




    //Json topic

    @Bean
    public NewTopic leronJsonTopic(){
        return TopicBuilder.name("leron_json").build();
    }

  /*  You can split the topic into partitions
    @Bean
    public NewTopic leronTopic(){
        return TopicBuilder.name("Leron").partitions(10).build();
    }*/
}
