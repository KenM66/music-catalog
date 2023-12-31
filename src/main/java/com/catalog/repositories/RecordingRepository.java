package com.catalog.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catalog.entities.Recording;

@Repository
public interface RecordingRepository extends JpaRepository<Recording, Long>{
	
	List<Recording> findByTitleContainingIgnoreCase(String title);
	
	List<Recording> findByArtistContainingIgnoreCase(String artist);
	
	List<Recording> findByGenreContainingIgnoreCaseOrSubGenreContainingIgnoreCase(String genre, String subGenre);
	
	
	
	

}
