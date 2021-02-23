package br.com.marcio.pingr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
@EnableCaching
public class PingrApplication {

	public static void main(String[] args) {
		SpringApplication.run(PingrApplication.class, args);
	}

}
