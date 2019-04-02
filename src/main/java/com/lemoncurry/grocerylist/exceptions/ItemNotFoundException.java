package com.lemoncurry.grocerylist.exceptions;

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
