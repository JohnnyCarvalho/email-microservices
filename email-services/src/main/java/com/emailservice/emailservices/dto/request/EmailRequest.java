package com.emailservice.emailservices.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

@Getter
@Setter
@Builder
@Jacksonized
public class EmailRequest {

    private String userName;

    @NotBlank(message = "This email can`t blank!")
    private String emailTo;

    private String subject;

    private String text;
}
