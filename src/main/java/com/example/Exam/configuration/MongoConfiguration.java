package com.example.Exam.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfiguration {

    @Autowired
    private MongoDatabaseFactory mongoDatabaseFactory;

    public MongoTemplate mongoTemplate(){
        return new MongoTemplate(mongoDatabaseFactory);
    }

}
