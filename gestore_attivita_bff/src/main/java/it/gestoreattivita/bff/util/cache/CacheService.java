package it.gestoreattivita.bff.util.cache;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class CacheService {


    @Autowired
    private RedisTemplate<String, Serializable> redisTemplate;

    public Serializable get(String key){
        Serializable e = redisTemplate.opsForValue().get(key);
        return e;
    }

    public void insert(String key,Serializable e){
        redisTemplate.opsForValue().set(key,e);
    }

    public void delete(String key){
        redisTemplate.opsForValue().getAndDelete(key);
    }


}
