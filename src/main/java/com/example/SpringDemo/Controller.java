package com.example.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

@RequestMapping(path = "/demo")
public class Controller {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/add")
    public @ResponseBody User addUser(@RequestBody User userData){
        User newUser=new User();
        newUser.setName(userData.getName());
        newUser.setEmail(userData.getEmail());
        userRepository.save(newUser);
        return newUser;
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAll(){
        return userRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody Optional<User> getById(@PathVariable Integer id){
//        System.out.println(userRepository.findById(id));
        return userRepository.findById(id);
    }
    @GetMapping(path = "/id")
    public @ResponseBody Optional<User> getById1(@RequestParam Integer id){
//        System.out.println(userRepository.findById(id));
        return userRepository.findById(id);
    }

    @GetMapping(path = "/name")
    public @ResponseBody Iterable<User> gatByName(@RequestParam String name){
        return userRepository.findByName(name);
    }
}
