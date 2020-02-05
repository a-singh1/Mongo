package com.example.mongodb.demo.spring.mongodb.repository;

import com.example.mongodb.demo.spring.mongodb.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users,Long> {
}
