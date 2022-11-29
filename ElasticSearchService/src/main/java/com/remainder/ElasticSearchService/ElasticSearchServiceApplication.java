package com.remainder.ElasticSearchService;

import com.remainder.ElasticSearchService.model.Event;
import com.remainder.ElasticSearchService.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@SpringBootApplication
public class ElasticSearchServiceApplication {

	@Autowired
	private EventRepository eventRepository;

	@PostMapping("saveEvent")
	public int saveEvent(@RequestBody List<Event> events) {
		eventRepository.saveAll(events);
		return events.size();
	}

	@GetMapping("/findAll")
	public Iterable<Event> findAllCustomers() {
		return eventRepository.findAll();
	}

	@GetMapping("/findByFName/{firstName}")
	public List<Event> findByFirstName(@PathVariable String firstName) {
		return eventRepository.findByFirstName(firstName);
	}
	public static void main(String[] args) {
		SpringApplication.run(ElasticSearchServiceApplication.class, args);
	}

}
