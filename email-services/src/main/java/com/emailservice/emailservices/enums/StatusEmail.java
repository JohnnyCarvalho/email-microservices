package com.emailservice.emailservices.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum StatusEmail {

    SENT,
    PENDING,
    ERROR
}
