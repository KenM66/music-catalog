package com.catalog.services;


import com.catalog.entities.SongRequest;

public interface EmailService {

    String sendRequestEmail(SongRequest body);



}
