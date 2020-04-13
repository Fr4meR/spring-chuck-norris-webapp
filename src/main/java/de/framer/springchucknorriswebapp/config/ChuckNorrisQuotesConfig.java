package de.framer.springchucknorriswebapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration for {@link guru.springframework.norris.chuck.ChuckNorrisQuotes} as spring bean
 */
@Configuration
public class ChuckNorrisQuotesConfig {

//    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
