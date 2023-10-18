package com.example.demo2.kafka;

import com.example.demo2.domain.kafka.TestKafkaData;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class TestCommandProducer {

    private final KafkaTemplate<String, TestKafkaData> template;
    public void send(TestKafkaData data){
        template.send("test", data);
    }

}
