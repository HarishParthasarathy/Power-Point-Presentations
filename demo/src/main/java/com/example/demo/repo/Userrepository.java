package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Test.Test;

public interface Userrepository extends JpaRepository<Test,Integer> { 

	
}
