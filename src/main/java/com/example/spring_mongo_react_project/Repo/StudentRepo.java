package com.example.spring_mongo_react_project.Repo;

import com.example.spring_mongo_react_project.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<Student,String> {
}