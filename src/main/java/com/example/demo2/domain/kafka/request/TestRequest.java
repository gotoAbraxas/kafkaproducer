package com.example.demo2.domain.kafka.request;


import com.example.demo2.domain.kafka.TestKafkaData;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TestRequest {

    private String id;
    private String name;

    public TestKafkaData toData(){

        return TestKafkaData.builder()
                .id(id)
                .name(name)
                .build();

    }
}
