package com.jnrproject.jnrbootcamp.exceptions;

import com.jnrproject.jnrbootcamp.util.MessageUtils;

public class NotFoundException extends RuntimeException{

    public NotFoundException() {
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
