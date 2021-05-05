package com.docsconsole.tutorials.exception;

import com.docsconsole.tutorials.constants.Constants;
import lombok.Getter;

@Getter
public class NotFoundException extends Exception {

    private Constants.HttpConstants status;

    public NotFoundException(Constants.HttpConstants status) {
        super(status.getDesc(), null);
        this.status = status;
    }
}
