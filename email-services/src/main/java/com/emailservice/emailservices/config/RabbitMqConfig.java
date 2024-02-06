package com.emailservice.emailservices.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    @Value("${broker.queue.email.name}")
    private String queue;

    /**
     * At this point, what the system does is create a new queue and pass
     * the queue name and whether it is durable as parameters. In other words,
     * if the RabbitMQ system happens to go down, whether this queue will be
     * preserved or not, in this case, yes, because we mark it as true.
     */
    @Bean
    public Queue queue() {
        return new Queue(queue, true);
    }

    /**
     * This function converts the incoming JSON object into a Java object to avoid potential exceptions.
     * @return A new Jackson2JsonMessageConverter object.
     */

    @Bean
    public Jackson2JsonMessageConverter messageConverter() {
        ObjectMapper objectMapper = new ObjectMapper();
        return new Jackson2JsonMessageConverter(objectMapper);
    }
}
