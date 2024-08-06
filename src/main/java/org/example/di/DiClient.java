package org.example.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DiClient {

    public static void main(String[] args) {

        String message ="Hi Good morning have a nice day!!!";
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DiAppConfig.class);


        MessageSender messageService = applicationContext.getBean(MessageSender.class);

        messageService.sendMessage(message);
    }

}
