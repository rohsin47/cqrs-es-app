package com.cqrs.app.domain;

import com.cqrs.app.core.CommandHandler;
import com.cqrs.app.core.Repository;

public class RenameInventoryItemHandler implements CommandHandler<RenameInventoryItem> {
    private Repository<InventoryItem> repository;

    public RenameInventoryItemHandler(Repository<InventoryItem> repository) {
        this.repository = repository;
    } 

    @Override
    public void handle(RenameInventoryItem command) throws InventoryItemDeactivatedException  {
        InventoryItem item = repository.getById(command.aggregateId);
        item.rename(command.name);
        repository.save(item);
    }
}