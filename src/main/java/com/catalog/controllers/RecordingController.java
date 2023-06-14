package com.catalog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	@PostMapping("/api/save-recording")
	public String saveRecording(@RequestBody Recording recording) {
		service.addRecording(recording);
		return recording.toString();
	}
	
	@GetMapping("api/recordings-by-title/{title}")
	public List<Recording> findByTitleContaining(@PathVariable String title){
		return service.getAllRecordingsContainingString(title);
	}
	


}
