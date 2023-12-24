package com.example.SpringDemo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Repository
//import
public interface UserRepository extends CrudRepository<User,Integer> {
    List<User> findByName(String name);
}


//interface DetailsRepository extends CrudRepository<User,Integer> {
//    List<User> findByName(String name);
//}
