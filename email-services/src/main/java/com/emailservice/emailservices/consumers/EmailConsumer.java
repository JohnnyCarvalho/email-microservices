package com.emailservice.emailservices.consumers;

import com.emailservice.emailservices.dto.request.EmailRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EmailConsumer {

    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenerEmailQueue(@Payload EmailRequest emailRequest) {
        log.info("The email body is: {}\nAnd user email is: {}", emailRequest, emailRequest.getEmailTo());
    }
}
