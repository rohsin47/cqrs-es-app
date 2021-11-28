package com.cqrs.app.domain;

import java.util.UUID;

import com.cqrs.app.core.Command;

public class DeactivateInventoryItem extends Command {

    private static final long serialVersionUID = 1L;

    public static DeactivateInventoryItem create(UUID aggregateId) {
        DeactivateInventoryItem cmd = new DeactivateInventoryItem();
        cmd.id = UUID.randomUUID();
        cmd.aggregateId = aggregateId;

        return cmd;
     }
}