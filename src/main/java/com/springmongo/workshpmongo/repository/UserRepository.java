package com.springmongo.workshpmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springmongo.workshpmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
