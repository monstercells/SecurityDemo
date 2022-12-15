package com.example.demo4;

import com.example.demo4.mapper.UserMapper;
import io.jsonwebtoken.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@SpringBootTest
class Demo4ApplicationTests {
    @Autowired
    UserMapper userMapper;
    public static void main(String[] args) {

    }
    @Test
    void contextLoads() {

    }
}
