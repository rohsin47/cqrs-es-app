package com.cqrs.app.domain;

import com.cqrs.app.core.CommandHandler;
import com.cqrs.app.core.Repository;

public class CreateInventoryItemHandler implements CommandHandler<CreateInventoryItem> {
    private Repository<InventoryItem> repository;

    public CreateInventoryItemHandler(Repository<InventoryItem> repository) {
        this.repository = repository;
    } 

    @Override
    public void handle(CreateInventoryItem command) {
        InventoryItem item = InventoryItem.create(command.aggregateId, command.name, command.initialQuantity);
        repository.save(item);
    }
}