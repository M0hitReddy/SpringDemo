package com.example.SpringDemo;

import jakarta.persistence.*;
import org.springframework.data.repository.CrudRepository;
//import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
//@Table(name="detail")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}


//@Entity
//@Table(name = "details")
//class Details{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    private
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//}

//interface detailsRepository extends CrudRepository<details>