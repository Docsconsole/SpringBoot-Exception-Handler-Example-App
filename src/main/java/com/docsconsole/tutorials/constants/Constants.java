package com.docsconsole.tutorials.constants;


import lombok.AllArgsConstructor;
import lombok.Getter;

public class Constants {

    @Getter
    @AllArgsConstructor
    public enum HttpConstants {

        SUCCESS(1, "Message: Success"),

        CUSTOM_FIELD_VALIDATION(2, null);

        private Integer code;

        private String desc;

    }
}
