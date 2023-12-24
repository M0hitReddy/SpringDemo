package com.example.SpringDemo;

import jakarta.persistence.Id;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.sql.rowset.CachedRowSet;

@Repository
public interface PerfumeRepository extends CrudRepository<Perfume, Long> {

}
