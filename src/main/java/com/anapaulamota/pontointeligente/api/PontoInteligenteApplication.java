package com.anapaulamota.pontointeligente.api;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PontoInteligenteApplication {
	
	@PostConstruct
    void started() {
      TimeZone.setDefault(TimeZone.getTimeZone("TimeZone"));
    }


	public static void main(String[] args) {
		SpringApplication.run(PontoInteligenteApplication.class, args);
	}

}
