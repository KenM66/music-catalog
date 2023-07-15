package com.catalog.controllers;

import com.catalog.entities.SongRequest;
import com.catalog.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("*")
public class CatalogController {
	
	@Autowired
	private EmailService service;
	@GetMapping("/demo-string")
	public String demo(){
		return "Hello Ken's Facebook Friends";
	}

	@PostMapping("/send-message")
	public String sendMessage(@RequestBody SongRequest request){

		System.out.println(request.getMessage());


		service.sendRequestEmail(request);
		return "Your song request has been sent to Ken Milota!";
	}
}
