package com.example.demo2;


import com.example.demo2.domain.kafka.request.TestRequest;
import com.example.demo2.kafka.TestCommandProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/test")
public class testController {

    private final TestCommandProducer testCommandProducer;



    @PostMapping
    public void test(@RequestBody TestRequest testRequest){

        testCommandProducer.send(testRequest.toData());

     }
}
