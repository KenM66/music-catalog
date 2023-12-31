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
	
	public void addRecording(Recording recording) {
		repository.save(recording);
	}
	
	public List<Recording> getAllRecordingsByTitleContainingString(String title){
		return repository.findByTitleContainingIgnoreCase(title);
	}
	
	public List<Recording> getAllRecordingsByArtistContainingString(String artist){
		return repository.findByArtistContainingIgnoreCase(artist);
	}
	
	public List<Recording> getAllRecordingsByGenreContainingString(String genre){
		return repository.findByGenreContainingIgnoreCaseOrSubGenreContainingIgnoreCase(genre, genre);
	}
	

}
