package it.gestoreattivita.bff.util.cache.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.connection.RedisConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.Serializable;

@Configuration
@Slf4j
public class CacheConfig {

    /*@Autowired

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
    }*/

    //@Bean(name = "jedisConnectionFactory")
    JedisConnectionFactory jedisConnectionFactory() {
        return new JedisConnectionFactory();
    }

    @Bean
    public RedisTemplate<String, Serializable> redisTemplate(RedisConnectionFactory connectionFactory) {
        System.out.println("redis template");
        RedisTemplate<String, Serializable> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);
        // Add some specific configuration here. Key serializers, etc.
        return template;
    }
   /* @Bean("jedisPool")
    JedisPool jedisPool(RedisProperties redisProperties) {
        return new JedisPool(new JedisPoolConfig(), redisProperties.getHost(), redisProperties.getPort());
    }*/

}
