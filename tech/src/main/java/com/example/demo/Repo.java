package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.TechEntity;

@Repository

public interface  Repo extends JpaRepository<TechEntity,Integer> {
   
}