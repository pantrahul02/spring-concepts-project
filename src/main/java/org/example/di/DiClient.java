package org.example.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DiClient {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DiAppConfig.class);


        MessageSender messageService = applicationContext.getBean(MessageSender.class);

        messageService.sendMessage("This is smsMessage sender...");
    }

}
