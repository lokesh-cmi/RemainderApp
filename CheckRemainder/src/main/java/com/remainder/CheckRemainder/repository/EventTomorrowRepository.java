package com.remainder.CheckRemainder.repository;
        import com.remainder.CheckRemainder.model.EventTomorrow;
        import org.springframework.data.mongodb.repository.MongoRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface EventTomorrowRepository extends MongoRepository<EventTomorrow, String> {
}

