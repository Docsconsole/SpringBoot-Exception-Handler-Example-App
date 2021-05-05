package com.docsconsole.tutorials.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Product does not exist.")
public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(int id) {
        super();
    }

}
