package com.catalog.services;

import com.catalog.entities.SongRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class CatalogService implements EmailService{

    @Autowired
    private JavaMailSender javaMailSender;
    @Value("${spring.mail.username}")
    private String sender;

    public CatalogService() {
    }

    @Override
    public String sendRequestEmail(SongRequest songRequest) {

        try{

            SimpleMailMessage mailMessage= new SimpleMailMessage();

            String greeting= "You have a new song request from "+ songRequest.getSenderEmail()+ "\n\n";



            mailMessage.setFrom(sender);
            mailMessage.setTo("kenm661@gmail.com");
            mailMessage.setText(greeting+songRequest);


            javaMailSender.send(mailMessage);
        }
        catch(Exception e){
            return "Error sending email";
        }

        return null;
    }
}
