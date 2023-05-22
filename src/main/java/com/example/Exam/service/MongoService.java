package com.example.Exam.service;

import com.example.Exam.model.MongoDocument;
import com.example.Exam.model.MongoDocumentDTO;
import com.example.Exam.repository.MongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.Optional;

public class MongoService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private MongoRepository mongoRepository;

    public MongoDocument create(MongoDocumentDTO mongoDocumentDTO){
        MongoDocument mongoDocument = new MongoDocument();
        mongoDocument.setFirstName(mongoDocumentDTO.getFirstName());
        mongoDocument.setSecondName(mongoDocumentDTO.getSecondName());
        mongoDocument.setScholarship(mongoDocumentDTO.getScholarship());
        mongoDocument.setFaculty(mongoDocumentDTO.getFaculty());
        mongoDocument.setGroup(mongoDocumentDTO.getGroup());
        mongoDocument.setFavoriteSubject(mongoDocumentDTO.getFavoriteSubject());
        mongoDocument.setRating(mongoDocumentDTO.getRating());
        mongoDocument.setPhoneNumber(mongoDocumentDTO.getPhoneNumber());
        mongoDocument.setCuratorName(mongoDocumentDTO.getCuratorName());
        mongoRepository.save(mongoDocument);
        return mongoDocument;
    }

    public MongoDocument update(MongoDocumentDTO mongoDocumentDTO, String operationID){
        Optional<MongoDocument> optionalMongoDocument = mongoRepository.findById(operationID);
        if(optionalMongoDocument.isPresent()){
            MongoDocument mongoDocument = optionalMongoDocument.get();
            mongoDocument.setFirstName(mongoDocumentDTO.getFirstName());
            mongoDocument.setSecondName(mongoDocumentDTO.getSecondName());
            mongoDocument.setScholarship(mongoDocumentDTO.getScholarship());
            mongoDocument.setFaculty(mongoDocumentDTO.getFaculty());
            mongoDocument.setGroup(mongoDocumentDTO.getGroup());
            mongoDocument.setFavoriteSubject(mongoDocumentDTO.getFavoriteSubject());
            mongoDocument.setRating(mongoDocumentDTO.getRating());
            mongoDocument.setPhoneNumber(mongoDocumentDTO.getPhoneNumber());
            mongoDocument.setCuratorName(mongoDocumentDTO.getCuratorName());
            return mongoTemplate.save(mongoDocument);
        }
        return null;
    }

    public void delete(String operationID){
        mongoRepository.deleteById(operationID);
    }

    public MongoDocument find(String operationID){
        return mongoRepository.findById(operationID).get();
    }

}
