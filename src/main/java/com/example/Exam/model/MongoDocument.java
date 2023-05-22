package com.example.Exam.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "students")
public class MongoDocument {

    @Id
    private String id;

    private String firstName;

    private String secondName;

    private Long scholarship;

    private String faculty;

    private String group;

    private String favoriteSubject;

    private Long rating;

    private String phoneNumber;

    private String curatorName;

}
