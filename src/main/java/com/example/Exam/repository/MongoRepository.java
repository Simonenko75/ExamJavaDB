package com.example.Exam.repository;

import com.example.Exam.model.MongoDocument;

public interface MongoRepository extends org.springframework.data.mongodb.repository.MongoRepository<MongoDocument, String> {

}
