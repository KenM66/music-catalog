package com.catalog.entities;

public class SongRequest {



    private String message;
    private String title;
    private String artist;
    private String senderEmail;





    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    @Override
    public String toString(){
        return "Song Title: "+this.title+"\nArtist: "+this.artist+"\nMessage From Sender: "+this.message;
    }
}
