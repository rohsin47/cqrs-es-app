package com.cqrs.app;

import java.util.UUID;

import com.cqrs.app.core.EventPublisher;

public class NoopPublisher implements EventPublisher {

    @Override
    public <T extends Event> void publish(UUID aggregateId, T event) {
    }
}