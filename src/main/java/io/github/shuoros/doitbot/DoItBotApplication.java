package io.github.shuoros.doitbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources({
        @PropertySource("classpath:application.properties"),
        @PropertySource("classpath:application-robot.properties")
})
public class DoItBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoItBotApplication.class, args);
    }

}
