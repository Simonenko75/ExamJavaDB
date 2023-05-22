package com.example.Exam.controller;

import com.example.Exam.model.MongoDocument;
import com.example.Exam.model.MongoDocumentDTO;
import com.example.Exam.service.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class MongoController {

    @Autowired
    private MongoService mongoService;

    @PostMapping("/create")
    public MongoDocument createDocument(@RequestBody MongoDocumentDTO mongoDocumentDTO){
        return mongoService.create(mongoDocumentDTO);
    }

    @PutMapping("/update")
    public MongoDocument updateDocument(@RequestBody MongoDocumentDTO mongoDocumentDTO, @RequestParam String id){
        return mongoService.update(mongoDocumentDTO, id);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam String id){
        mongoService.delete(id);
    }

    @GetMapping("/find-id")
    public MongoDocument find(@RequestBody MongoDocumentDTO mongoDocumentDTO, @RequestParam String id){
        return mongoService.find(id);
    }

}
