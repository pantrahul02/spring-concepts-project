package org.example;

import org.example.beans.Bike;
import org.example.beans.Car;
import org.example.beans.Cycle;
import org.example.beans.Traveler;
import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = context.getBean(Car.class);
        //car.move();

        Bike bike = context.getBean(Bike.class);
        //bike.move();

        Cycle cycle = context.getBean(Cycle.class);
        //cycle.move();

        System.out.println("==================================");

        Traveler traveler = context.getBean(Traveler.class);
        traveler.startJourny();

    }
}
