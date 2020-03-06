package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Test.Test;
import com.example.demo.repo.Userrepository;

@RestController
@RequestMapping (path="/demo")
public class Control {
	@Autowired
	private Userrepository repo;
	@PostMapping(path="/add")
	public String addNewUser(@RequestParam String fname, @RequestParam String lname,
			@RequestParam String email) {
		Test t =new Test();
		t.setFirstname(fname);
		t.setFirstname(lname);
		t.setEmail(email);
		repo.save(t);
		return  "Saved";
	}
}

	

