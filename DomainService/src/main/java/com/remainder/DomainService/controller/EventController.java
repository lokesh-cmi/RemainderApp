package com.remainder.DomainService.controller;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import com.remainder.DomainService.model.Event;
import com.remainder.DomainService.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class EventController {

//    static final Logger logger = LogManager.getLogger(EventController.class);

    @Autowired
    EventService eventService;

    @PostMapping("/addEvent")
    public String addEvent(@RequestBody Event event){
        return eventService.addEvent(event);

    }

    @GetMapping("/events")
    public List<Event> getEvents() {
//        logger.warn("Warned level log message");
        return eventService.getEvents();
    }

    @GetMapping("readEventById/{id}")
    public Event readEventById(@PathVariable String id) {
        return eventService.readEventById(id);
    }

    @GetMapping("/readEventByName/{name}")
    public Event readEventByName(@PathVariable String name) {
        return eventService.readEventByName(name);
    }

    @GetMapping("/readEventByEvent/{event}")
    public Event readEventByEvent(@PathVariable String event) {
        return eventService.readEventByEvent(event);
    }

    @GetMapping("/readEventByDate/{date}")
    public Event readEventByDate(@PathVariable String date) {
        return eventService.readEventByDate(date);
    }

    @PutMapping("/updateEvent")
    public Event updateEvent(@RequestBody Event event) {
        return eventService.updateEvent(event);
    }

    @DeleteMapping("/deleteEvent")
    public String deleteEvent(@RequestBody String id) {
        System.out.println(eventService.deleteEvent(id));
        return "Deleted";
    }
}