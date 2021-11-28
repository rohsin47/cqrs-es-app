package com.cqrs.app.domain;

import java.util.UUID;

import com.cqrs.app.core.Command;

public class CheckInventoryItemOut extends Command {
    private static final long serialVersionUID = 2660471147867347530L;
    public int quantity;

    public static CheckInventoryItemOut create(UUID aggregateId, int quantity) {
        CheckInventoryItemOut cmd = new CheckInventoryItemOut();
        cmd.id = UUID.randomUUID();
        cmd.aggregateId = aggregateId;
        cmd.quantity = quantity;

        return cmd;
    }
}