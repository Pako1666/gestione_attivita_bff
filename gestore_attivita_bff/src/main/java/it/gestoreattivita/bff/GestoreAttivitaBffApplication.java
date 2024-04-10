package it.gestoreattivita.bff;

import it.gestoreattivita.bff.util.cache.config.CacheConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableCaching

public class GestoreAttivitaBffApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestoreAttivitaBffApplication.class, args);
	}

}
