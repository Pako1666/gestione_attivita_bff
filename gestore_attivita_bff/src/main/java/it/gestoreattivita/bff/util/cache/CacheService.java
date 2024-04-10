package it.gestoreattivita.bff.util.cache;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    @Autowired
    @Qualifier("gestoreAttivitaCache")
    @Lazy
    Cache cache;


    public <T> T get(String key){
        Cache.ValueWrapper value = cache.get(key);

        return value!=null? (T) value.get(): null;
    }

    public <T> void insert(String key,T obj){
        cache.put(key,obj);
    }

    public void delete(String key){
        cache.evict(key);
    }
}
