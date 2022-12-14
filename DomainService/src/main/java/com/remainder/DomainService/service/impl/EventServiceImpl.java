package com.remainder.DomainService.service.impl;

//import com.example.crudTestBackend.models.Event;
//import com.example.crudTestBackend.repo.EventRepo;
//import com.example.crudTestBackend.service.EventService;
import com.remainder.DomainService.model.Event;
import com.remainder.DomainService.repository.EventRepository;
import com.remainder.DomainService.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

//import static com.example.crudTestBackend.CrudTestBackendApplication.logger;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepo;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String addEvent(Event event) {
        String currentDate = new SimpleDateFormat("dd-MM-yyyy").format(new Date()).toString();
        event.setCreatedAt(currentDate);
        event.setUpdatedAt(currentDate);
        event.setCreatedBy(event.getName());
        event.setUpdatedBy(event.getName());
        eventRepo.save(event);
        addTomorrowEvent();
        return event.toString();

    }

    @Override
    public List<Event> getEvents() {
        System.out.println(eventRepo.findAll());
        return eventRepo.findAll();
    }

    @Override
    public Event readEventById(String id) {
        return eventRepo.findById(id).get();
    }
    @Override
    public Event readEventByName(String name) {
        return eventRepo.findByName(name).get(0);
    }

    @Override
    public Event readEventByEvent(String event) {
        return eventRepo.findByEvent(event).get(0);
    }

    @Override
    public Event readEventByDate(String date) {
        return eventRepo.findByDate(date).get(0);
    }

    @Override
    public Event updateEvent(Event event) {
        Event event1 = eventRepo.findById(event.getId()).get();
        event1.setName(event.getName());
        event1.setEvent(event.getEvent());
        event1.setDate(event.getDate());
        event1.setTime(event.getTime());
        event1.setUpdatedAt(new SimpleDateFormat("dd-MM-yyyy").format(new Date()).toString());
        event1.setUpdatedBy(event.getName());
        eventRepo.save(event1);

        return eventRepo.findById(event.getId()).get();
    }

    @Override
    public String deleteEvent(String id) {
        eventRepo.deleteById(id);
        return "Deleted Successfully";
    }

    @Override
    public void addTomorrowEvent()
    {
        restTemplate.getForObject("http://localhost:8080/remainderCheck", Event.class);
    }


}
