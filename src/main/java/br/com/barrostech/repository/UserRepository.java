package br.com.barrostech.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.barrostech.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
