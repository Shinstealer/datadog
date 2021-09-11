package com.ex.datadog.accessor;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisAccessor {

    private StringRedisTemplate stringRedisTemplate;

    public RedisAccessor(@Qualifier("getStringRedisTemplate") StringRedisTemplate stringRedisTemplate) {

        this.stringRedisTemplate = stringRedisTemplate;
    }

    public long incrment(){
        return stringRedisTemplate.opsForValue().increment("event-id");
    }

}
