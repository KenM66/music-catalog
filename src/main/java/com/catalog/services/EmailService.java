package com.catalog.services;


import com.catalog.entities.ConfirmationMessage;
import com.catalog.entities.SongRequest;

public interface EmailService {

    String sendRequestEmail(SongRequest body);

    String sendConfirmationMessage(ConfirmationMessage message);



}
