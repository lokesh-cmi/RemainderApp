package com.remainder.DomainService.service;


import com.remainder.DomainService.model.Event;

import java.util.List;

public interface EventService {

    public String addEvent(Event event);
    public List<Event> getEvents();
    Event readEventByName(String name);
    Event readEventByEvent(String event);
    Event readEventByDate(String date);
    Event updateEvent(Event event);
    String deleteEvent(String id);
    Event readEventById(String id);

}
