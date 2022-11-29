package com.remainder.CheckRemainder.service;

import com.remainder.CheckRemainder.model.Event;
import com.remainder.CheckRemainder.model.EventTomorrow;
import com.remainder.CheckRemainder.repository.EventRepository;
import com.remainder.CheckRemainder.repository.EventTomorrowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

@Service
public class RemainderService {
        Logger logger = Logger.getLogger(RemainderService.class.getName());

        @Autowired
        EventRepository eventRepository;
        @Autowired
        private EventTomorrowRepository eventTomorrowRepository;

        public void pushRemainder() {

                Calendar calendar = Calendar.getInstance();
                Date today = calendar.getTime();
                calendar.add(Calendar.DAY_OF_YEAR, 1);
                Date tomorrow = calendar.getTime();
                String tomDate = new SimpleDateFormat("dd-MM-yyyy").format(tomorrow).toString();
                logger.info(tomDate);

                eventRepository.findByDate(tomDate).forEach(event -> {
                        EventTomorrow eventTomorrow = new EventTomorrow();
                        eventTomorrow.setId(event.getId());
                        eventTomorrow.setName(event.getName());
                        eventTomorrow.setEvent(event.getEvent());
                        eventTomorrow.setDate(event.getDate());
                        eventTomorrow.setTime(event.getTime());
                        eventTomorrow.setCreatedAt(event.getCreatedAt());
                        eventTomorrow.setUpdatedAt(event.getUpdatedAt());
                        eventTomorrow.setCreatedBy(event.getCreatedBy());
                        eventTomorrow.setUpdatedBy(event.getUpdatedBy());

                        eventTomorrowRepository.save(eventTomorrow);
                });
        }
}
