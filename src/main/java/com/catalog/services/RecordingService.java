package com.catalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalog.entities.Recording;
import com.catalog.repositories.RecordingRepository;

@Service
public class RecordingService {
	
	@Autowired
	private RecordingRepository repository;
	
	public List<Recording> getAllRecordings(){
		return repository.findAll();
	}

}