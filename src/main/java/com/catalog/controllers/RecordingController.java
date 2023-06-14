package com.catalog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catalog.entities.Recording;
import com.catalog.services.RecordingService;

@RestController
public class RecordingController {
	
	@Autowired 
	private RecordingService service;
	
	@GetMapping("/api/recordings")
	public List<Recording> findAllRecordings(){
		return service.getAllRecordings();
	}
	
	@GetMapping("/other-demo")
	public String otherDemo() {
		return "This is the other demo";
	}

}
//afdafadsd