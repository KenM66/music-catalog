package com.catalog.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Recording {
	
	@Id
	@GeneratedValue
	private long id; 
	
	private String title;
	private String artist; 
	private String genre; 
	private String subGenre; 
	private String link;
	
	public Recording() {
		
	}
	
	public Recording(String title, String artist, String genre, String subGenre, String link) {
		super();
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.subGenre = subGenre;
		this.link = link;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getSubGenre() {
		return subGenre;
	}
	public void setSubGenre(String subGenre) {
		this.subGenre = subGenre;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	@Override
	public String toString() {
		return "Recording [id=" + id + ", title=" + title + ", artist=" + artist + ", genre=" + genre + ", subGenre="
				+ subGenre + ", link=" + link + "]";
	} 
	
	
	
	

}
