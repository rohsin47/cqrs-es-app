package com.cqrs.app.core;

import java.util.UUID;

public interface Repository<T extends AggregateRoot> {
    public T getById(UUID aggregateId);
    public void save(T aggregate);
}