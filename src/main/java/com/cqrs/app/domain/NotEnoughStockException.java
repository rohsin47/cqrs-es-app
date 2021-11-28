package com.cqrs.app.domain;

import com.cqrs.app.core.DomainException;

public class NotEnoughStockException extends DomainException {

    private static final long serialVersionUID = -6578758996745570912L;

    public NotEnoughStockException(String message) {
        super(message);
    }
}