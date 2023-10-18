package com.example.demo2.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicConfig {
    public static final String testCommand = "test";
    @Bean
    public NewTopic orderCommand(){
        return new NewTopic(testCommand, 1, (short) 1);
    }
}