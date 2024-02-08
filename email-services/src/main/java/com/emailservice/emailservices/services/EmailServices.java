package com.emailservice.emailservices.services;

import com.emailservice.emailservices.entities.Email;
import com.emailservice.emailservices.enums.StatusEmail;
import com.emailservice.emailservices.repositories.EmailRepository;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class EmailServices {

    private final EmailRepository repository;

    private final JavaMailSender emailSender;

    @Value("${spring.mail.username}")
    private String emailFrom;

    public void sendEmail(Email request) {

        try {
            request.setSendDateEmail(LocalDateTime.now());
            request.setEmailFrom(emailFrom);

            SimpleMailMessage message = new SimpleMailMessage();

            message.setTo(request.getEmailTo());
            message.setSubject(request.getSubject());
            message.setText(request.getText());
            emailSender.send(message);

            repository.save(request);

            request.setStatusEmail(StatusEmail.SENT);

        } catch (MailException ex) {
            request.setStatusEmail(StatusEmail.ERROR);
        }
    }
}
