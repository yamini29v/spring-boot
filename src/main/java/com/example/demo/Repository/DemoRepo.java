package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Demo;

public interface DemoRepo extends JpaRepository<Demo, Long> {

}
