package com.cqrs.app.core;

public interface CommandHandler<T extends Command> {
    public void handle(T command) throws DomainException;
}
