package com.shigapov.springkafkademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("msg")
public class ProducerStrMsgController {

/*    @Autowired
    @Qualifier("kafkaTemplateStr")
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("str")
    public void sendStrMsg(String msgId, String msg){
        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send("msg", msgId, msg);
        future.addCallback(System.out::println, System.err::println);
        kafkaTemplate.flush();
    }*/

}
