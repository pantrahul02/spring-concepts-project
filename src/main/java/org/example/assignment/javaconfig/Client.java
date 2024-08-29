package org.example.assignment.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfg.class);
        EmailService service = context.getBean(EmailService.class);
        service.sendEmail();
    }
}
