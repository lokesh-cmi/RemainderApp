package com.remainder.ElasticSearchService.repository;

import com.remainder.ElasticSearchService.model.Event;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends ElasticsearchRepository<Event, String> {
    List<Event> findByFirstName(String firstname);
}
