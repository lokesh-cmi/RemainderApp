package com.remainder.DomainService.repository;

import com.remainder.DomainService.model.Event;
import org.springframework.data.mongodb.repository.DeleteQuery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EventRepository extends MongoRepository<Event, String> {

    @Query("{ 'name' : ?0 }")
    List<Event> findByName(String name);

    @Query("{ 'event' : ?0 }")  
    List<Event> findByEvent(String event);

    @Query("{ 'date' : ?0 }")
    List<Event> findByDate(String date);


    @Query("{ 'time' : ?0 }")
    List<Event> findByTime(String time);
}

