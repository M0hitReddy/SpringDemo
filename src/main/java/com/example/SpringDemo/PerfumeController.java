package com.example.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/perfume")
public class PerfumeController {

    @Autowired private PerfumeRepository perfumeRepository;

    @PostMapping(path = "/add")
    public Perfume addPerfume(@RequestBody Perfume perfume){
        Perfume p=new Perfume();
        p.setName(perfume.getName());
        p.setPrice(perfume.getPrice());
        p.setDescription(perfume.getDescription());
        perfumeRepository.save(p);
        return p;
    }

    @GetMapping(path = "/all")
    public Iterable<Perfume> findAll(){
        return perfumeRepository.findAll();
    }
}
