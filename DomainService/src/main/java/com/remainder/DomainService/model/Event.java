package com.remainder.DomainService.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.text.ParseException;
import java.util.Date;

@Document("calander")
public class Event {

    @Id
    private String id;
    private String name;
    private String event;
    private String date;
    private String time;
    private String createdAt;
    private String updatedAt;

    @Override
    public String toString() {
        return "Event{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", event='" + event + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }

    public Event() {
        super();
    }



    public String getId()  {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return (new Date().toString());
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Event(String id, String name, String event, String date, String time,String createdAt, String updatedAt) throws ParseException {
        super();
        this.id = id;
        this.name = name;
        this.event = event;
        this.date = date;
        this.time = time;
        this.createdAt = createdAt;

    }

}
