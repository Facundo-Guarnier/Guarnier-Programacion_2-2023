package org.example.Ejercicio1;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource("classpath:config.properties")
public class ConfigurationProperties {

    @Value("${e1.default.exponent}")
    private int defaultExponent;

    @Value("${e1.default.root}")
    private int defaultRoot;
}
