package it.gestoreattivita.bff.rs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
@Slf4j
public class GestioneAttivitaRestService {


    private RestTemplate restTemplate;

    @Value("${bff.service.destinationServer}")
    private String baseUrl;

    @Autowired
    public GestioneAttivitaRestService(){
        log.info("url di destinazione: "+baseUrl);
        restTemplate = new RestTemplate();
    }


    public <REQ,RES> RES doPost(String resource, REQ  req,Class<RES> resCls){
        log.info("url di destinazione: "+baseUrl);
        HttpEntity<REQ> request = new HttpEntity<REQ>(req);

        log.info(this.baseUrl + resource);

        RES body = this.restTemplate.postForObject(
                this.baseUrl + resource,
                request, resCls
        );
        return body;
    }

    public <T> T doGet(String resource,Class<T> cls){
        log.info("url di destinazione: "+baseUrl+resource);
        T body = this.restTemplate.getForObject(baseUrl+resource, cls);
        return body;
    }

    public <T> T doGet(String resource,Class<T> cls, String pathVariable){
        log.info("url di destinazione: "+baseUrl);
        String uri = String.format("%s%s%s",baseUrl,resource,pathVariable);
        log.info(uri);
        return this.restTemplate.getForObject(uri, cls);
    }

    public <T> T doGet(String resource, Class<T>cls, Map<String,Object> query){
        log.info("url di destinazione: "+baseUrl);
        String uri = String.format("%s/%s?",baseUrl,resource);

        for(String key: query.keySet()){
            uri = uri.concat(
                    String.format("%s=%o&",key,query.get(key))
            );
        }


        return this.restTemplate.getForObject(uri, cls);
    }


}
