package com.catalog.controllers;

import com.catalog.entities.SongRequest;
import com.catalog.services.EmailService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("*")
public class CatalogController {
	
	@Autowired
	private EmailService service;
	@Autowired
	ObjectMapper mapper;
	@GetMapping("/demo-string")
	public String demo(){
		return "Hello Ken's Facebook Friends";
	}

	@PostMapping("/send-message")
	public String sendMessage(@RequestBody SongRequest request) throws JsonProcessingException {




		service.sendRequestEmail(request);
		return mapper.writeValueAsString("Your song request has been sent to Ken Milota!");
	}
}
