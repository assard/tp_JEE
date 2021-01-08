package tsi.ensg.jee.tp2.exo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigLibrary {

    @Bean
    Book bookOne(){
        return new Book("Harry Potter and the philosopher's stone",01);
    }

    @Bean
    Book bookTwo(){
        return new Book("Harry Potter and the secret's chamber",02);
    }

    @Bean
    Book bookThree(){
        return new Book("Harry Potter and the prisoner of Azkaban",03);
    }

    @Bean
    Library Library(){
        return new Library();
    }



}
