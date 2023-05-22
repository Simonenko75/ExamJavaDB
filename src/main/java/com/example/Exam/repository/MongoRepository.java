package com.example.Exam.repository;

import com.example.Exam.model.MongoDocument;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoRepository extends org.springframework.data.mongodb.repository.MongoRepository<MongoDocument, String> {

}
