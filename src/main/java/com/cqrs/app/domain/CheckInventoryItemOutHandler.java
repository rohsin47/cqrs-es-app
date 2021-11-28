package com.cqrs.app.domain;

import com.cqrs.app.core.CommandHandler;
import com.cqrs.app.core.Repository;

public class CheckInventoryItemOutHandler implements CommandHandler<CheckInventoryItemOut> {
    private Repository<InventoryItem> repository;

    public CheckInventoryItemOutHandler(Repository<InventoryItem> repository) {
        this.repository = repository;
    }

    @Override
    public void handle(CheckInventoryItemOut command) throws NotEnoughStockException, InventoryItemDeactivatedException  {
        InventoryItem item = repository.getById(command.aggregateId);
        item.checkOut(command.quantity);
        repository.save(item);
    }
}