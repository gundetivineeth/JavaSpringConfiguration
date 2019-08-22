package vineeth.springframework.springconfiguration.javaexample.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigurations {

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes()
    {
        return new ChuckNorrisQuotes();
    }
}
