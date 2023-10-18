package com.example.demo2.domain.kafka;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class TestKafkaData {

    private String id;
    private String name;
}
