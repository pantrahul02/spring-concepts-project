package org.example.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class Student {

    private Address address;

    public Student(Address address) {
        this.address = address;
    }

    public void print() {
        System.out.println("Student method called...");
        address.print();
    }

    public void init() {
        System.out.println("init method logic called");
    }

    public void destroy() {
        System.out.println("destruction method logic called");
    }
}

class Address {
    public void print() {
        System.out.println("Hello this is address class...");
    }
}

@Configuration
class AppConfig {

    @Bean(name = "addressBean")
    public Address address() {
        return new Address();
    }

    @Bean(name = "studentBean", initMethod = "init", destroyMethod = "destroy")
    public Student student() {
        return new Student(address());
    }
}

public class BeanAnnotationDemo {

    public static void main(String[] args) {
        try (var applicationContext = new AnnotationConfigApplicationContext(AppConfig.class)) {
            String[] beanNames = applicationContext.getBeanDefinitionNames();
            for (String bean : beanNames) {
                System.out.println(bean);
            }
            Student student = applicationContext.getBean(Student.class);
            student.print();
        }

    }
}
