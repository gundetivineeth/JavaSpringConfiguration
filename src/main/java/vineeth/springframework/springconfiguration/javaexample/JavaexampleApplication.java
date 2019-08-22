package vineeth.springframework.springconfiguration.javaexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chunk-config.xml")
public class JavaexampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaexampleApplication.class, args);
    }

}
