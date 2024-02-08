package com.emailservice.emailservices.consumers;

import com.emailservice.emailservices.dto.request.EmailRequest;
import com.emailservice.emailservices.entities.Email;
import com.emailservice.emailservices.services.EmailServices;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class EmailConsumer {

    private final EmailServices services;

    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenerEmailQueue(@Payload EmailRequest emailRequest) {

        var emailModel = new Email();
        BeanUtils.copyProperties(emailRequest, emailModel);
        services.sendEmail(emailModel);
        log.info("The email body is: {}\nAnd user email is: {}", emailModel, emailRequest.getEmailTo());
    }
}
