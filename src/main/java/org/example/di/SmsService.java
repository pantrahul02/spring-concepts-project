package org.example.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("smsService")
@Primary
public class SmsService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
