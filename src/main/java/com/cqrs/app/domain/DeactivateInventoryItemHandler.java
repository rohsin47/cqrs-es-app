package com.cqrs.app.domain;

import com.cqrs.app.core.CommandHandler;
import com.cqrs.app.core.Repository;

public class DeactivateInventoryItemHandler implements CommandHandler<DeactivateInventoryItem> {
    private Repository<InventoryItem> repository;

    public DeactivateInventoryItemHandler(Repository<InventoryItem> repository) {
        this.repository = repository;
    } 

    @Override
    public void handle(DeactivateInventoryItem command) {
        InventoryItem item = repository.getById(command.aggregateId);
        item.deactivate();;
        repository.save(item);
    }
}