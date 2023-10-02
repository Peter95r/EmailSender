package com.example.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailEndpoint {

    private final EmailService emailService;

    @Autowired
    public EmailEndpoint(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/api/send-email")
    public void sendEmail(@RequestBody EmailUnit emailRequest) {
        emailService.sendEmail(emailRequest.getTo(), emailRequest.getSubject(), emailRequest.getText());
    }
}

