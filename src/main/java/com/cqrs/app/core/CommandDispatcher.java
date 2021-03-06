package com.cqrs.app.core;

public interface CommandDispatcher {
    <T extends Command> void dispatch(T command) throws DomainException;
}