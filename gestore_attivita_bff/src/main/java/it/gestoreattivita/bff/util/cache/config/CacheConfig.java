package it.gestoreattivita.bff.util.cache.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.connection.RedisConfiguration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

@Configuration
@Slf4j
@EnableCaching
public class CacheConfig {

    @Autowired

    private CacheManager cacheManager;

    @Value("${spring.cache.cache-names}")
    private String cacheName;

    @Bean
    @Lazy
    public Cache gestoreAttivitaCache(){
        log.info("cache inizializzata");
        Cache cache = cacheManager.getCache(cacheName);
        log.info(cache.toString());
        return cache;
    }

}
