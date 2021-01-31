package com.shigapov.springkafkademo.controller;

import com.shigapov.springkafkademo.dto.Address;
import com.shigapov.springkafkademo.dto.UserDto;
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
public class ProducerUserMsgController {

    @Autowired
    @Qualifier("kafkaTemplateUserDto")
    private KafkaTemplate<Long, UserDto> kafkaTemplate;

    @PostMapping("user")
    public void sendLongMsg(Long msgId, UserDto msg){
        msg = new UserDto("Ivan", 45L,
                new Address("UK", "UFA", "Bologorskoe", 34L, 1L));

        ListenableFuture<SendResult<Long, UserDto>> future = kafkaTemplate.send("msg", msgId, msg);
        future.addCallback(System.out::println, System.err::println);
        kafkaTemplate.flush();
    }
}
