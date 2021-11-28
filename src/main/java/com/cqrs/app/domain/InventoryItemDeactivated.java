package com.cqrs.app.domain;

import java.util.UUID;

import com.cqrs.app.core.Event;

public class InventoryItemDeactivated extends Event {

    private static final long serialVersionUID = 1L;
    
    public static InventoryItemDeactivated create(UUID aggregateId) {
        InventoryItemDeactivated evt = new InventoryItemDeactivated();
        evt.aggregateId = aggregateId;
        return evt;
    }
}