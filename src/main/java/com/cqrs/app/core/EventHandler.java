package com.cqrs.app.core;

public interface EventHandler<T extends Event> {
    public void handle(T event);
}