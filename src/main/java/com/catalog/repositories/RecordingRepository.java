package com.catalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catalog.entities.Recording;

@Repository
public interface RecordingRepository extends JpaRepository<Recording, Long>{

}
