package com.ex.datadog.controller;

import com.ex.datadog.accessor.RedisAccessor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    private RedisAccessor redisAccessor;

    public RestApiController(RedisAccessor redisAccessor) {
        this.redisAccessor = redisAccessor;
    }

    @GetMapping("/add/event")
    public String addEventId() {
        redisAccessor.incrment();
        return "done";
    }
}
