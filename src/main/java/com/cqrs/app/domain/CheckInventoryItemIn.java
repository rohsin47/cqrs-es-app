package com.cqrs.app.domain;

import java.util.UUID;

import com.cqrs.app.core.Command;

public class CheckInventoryItemIn extends Command {
    private static final long serialVersionUID = 1L;
    public int quantity;

    public static CheckInventoryItemIn create(UUID aggregateId, int quantity) {
        CheckInventoryItemIn cmd = new CheckInventoryItemIn();
        cmd.id = UUID.randomUUID();
        cmd.aggregateId = aggregateId;
        cmd.quantity = quantity;

        return cmd;
    }
}