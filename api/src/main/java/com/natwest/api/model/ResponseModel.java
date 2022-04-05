package com.natwest.api.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Getter
@Setter
public class ResponseModel {

    public String messageString;

    public String messageCode;

    @Override
    public String toString() {
        return "ResponseModel{" +
                "messageString='" + messageString + '\'' +
                ", messageCode='" + messageCode + '\'' +
                '}';
    }
}
