package org.example;

import org.example.config.AppConfig;
import org.example.controller.DemoController;
import org.example.repository.DemoRepository;
import org.example.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        DemoController controller = context.getBean(DemoController.class);
        System.out.println(controller.hello());

        DemoService service = context.getBean(DemoService.class);
        System.out.println(service.hello());

        DemoRepository demoRepository = context.getBean(DemoRepository.class);
        System.out.println(demoRepository.hello());
    }
}
