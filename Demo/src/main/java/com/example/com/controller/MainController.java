package com.example.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.test.UserRepository;
import com.example.demo.user.User;

@RestController
@RequestMapping(path="/demo")

public class MainController {
	@Autowired
	private UserRepository userrepo;

	@PostMapping(path="/add") // Map ONLY POST Requests
	  public  String addNewUser (@RequestParam String name
	      , @RequestParam String email) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request

		    User n = new User();
		    n.setName(name);
		    n.setEmail(email);
		    userrepo.save(n);
		    return "Saved"; 
	

}
}
