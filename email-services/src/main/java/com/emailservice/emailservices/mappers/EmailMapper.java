package com.emailservice.emailservices.mappers;

import com.emailservice.emailservices.dto.request.EmailRequest;
import com.emailservice.emailservices.entities.Email;
import java.time.LocalDateTime;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public interface EmailMapper {

//    static SimpleMailMessage sendEmailToModel(EmailRequest request, String emailFrom, JavaMailSender emailSender) {
//
//        Email email = new Email();
//
//        email.setSendDateEmail(LocalDateTime.now());
//        email.setEmailFrom(emailFrom);
//
//        SimpleMailMessage message = new SimpleMailMessage();
//
//        message.setTo(request.getEmailTo());
//        message.setSubject(request.getSubject());
//        message.setText(request.getText());
//
//        return message;
//    }
}
