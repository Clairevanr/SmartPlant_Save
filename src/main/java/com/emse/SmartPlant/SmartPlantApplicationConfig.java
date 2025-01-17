package com.emse.SmartPlant;

import com.emse.SmartPlant.greeting.GreetingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SmartPlantApplicationConfig {

    @Bean
    public CommandLineRunner greetingCommandLine(GreetingService greetingService){
        return args -> {
            greetingService.greet("Spring");
        };
    }
}
