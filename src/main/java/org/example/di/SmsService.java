package org.example.di;

import org.springframework.stereotype.Component;

@Component
public class SmsService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sms sending using SmsService...");
    }
}
