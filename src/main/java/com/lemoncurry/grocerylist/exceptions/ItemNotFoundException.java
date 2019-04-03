package com.lemoncurry.grocerylist.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ItemNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 8691932273480876031L;

    public ItemNotFoundException() {
        super();
    }

    public ItemNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public ItemNotFoundException(final String message) {
        super(message);
    }

    public ItemNotFoundException(final Throwable cause) {
        super(cause);
    }
}
