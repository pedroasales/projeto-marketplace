package com.seuprojeto.backend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;

@Configuration
public class RabbitConfig {

    @Bean
    public Queue filaTeste() {
        return new Queue("fila-teste", false);
    }
}