package com.remainder.CheckRemainder.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("calander")
@Data
@AllArgsConstructor
@NoArgsConstructor
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
