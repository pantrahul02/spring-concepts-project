package org.example.assignment.javaconfig;

import org.example.assignment.javaconfig.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="org.example.assignment.javaconfig")
public class AppConfg {

    @Bean
    public DataSource mysqlDataSource(){
        return new MySQLDataSource();
    }

    @Bean
    public DataSource postgressSQLDataSource(){
        return new PostgressSQLDataSource();
    }

    @Bean
    public EmailService emailService(){
        return new EmailService(postgressSQLDataSource());
    }


}
