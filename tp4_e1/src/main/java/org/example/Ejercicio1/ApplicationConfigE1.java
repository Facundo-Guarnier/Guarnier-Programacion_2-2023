package org.example.Ejercicio1;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
@ComponentScan("org.example")
public class ApplicationConfigE1 {
    @Bean
    public ArranqueE1 arranque() {
        return new ArranqueE1();
    }
}
