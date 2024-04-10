package it.gestoreattivita.bff.util.cache.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfig {

    @Autowired
    private CacheManager cacheManager;

    @Value("${spring.cache.cache-names}")
    private String cacheName;

    @Bean
    public Cache gestoreAttivitaCache(){
        System.out.println("cache inizializzata");
        return cacheManager.getCache(cacheName);

    }

}
