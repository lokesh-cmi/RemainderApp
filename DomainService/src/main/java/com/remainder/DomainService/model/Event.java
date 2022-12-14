package com.remainder.DomainService.model;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.text.ParseException;
import java.util.Date;

@Document("calander")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Event {
    @Id
    private String id;
    private String name;
    private String event;
    private String date;
    private String time;
    private String createdAt;
    private String updatedAt;
    private String createdBy;
    private String updatedBy;
}
