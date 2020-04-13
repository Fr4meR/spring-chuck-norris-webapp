package de.framer.springchucknorriswebapp;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-quotes-config.xml")
public class SpringChuckNorrisWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringChuckNorrisWebappApplication.class, args);
	}

}
