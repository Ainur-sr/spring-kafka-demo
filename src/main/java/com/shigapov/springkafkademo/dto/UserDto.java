package com.shigapov.springkafkademo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {
    private String name;
    private Long age;
    private Address address;
}
