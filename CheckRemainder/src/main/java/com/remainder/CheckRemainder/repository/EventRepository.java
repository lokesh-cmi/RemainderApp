package com.remainder.CheckRemainder.repository;

import com.remainder.CheckRemainder.model.Event;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends MongoRepository<Event, String> {
    @Query(value = "{ 'date' : ?0 } ")
    public List<Event> findByDate(String date);
}

