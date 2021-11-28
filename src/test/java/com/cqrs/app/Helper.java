package com.cqrs.app;

import java.util.ArrayList;

import com.cqrs.app.core.AggregateRoot;
import com.cqrs.app.core.Event;

public class Helper {

    @SuppressWarnings("unchecked")
    public static <T extends Event> ArrayList<T> getEvents(AggregateRoot root, Class<T> type)
	{
		ArrayList<T> events = new ArrayList<T>();
		for (Event evt : root.getUncommittedChanges()) {
			if (evt.getClass() == type)
				events.add((T) evt);
		}
		return events;
	}

}