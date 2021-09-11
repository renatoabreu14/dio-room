package com.digital.crud.saladereuniao.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class ErrorDetails {

    private Date timestramp;
    private String message;
    private String details;

}
