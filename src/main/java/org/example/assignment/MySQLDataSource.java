package org.example.assignment;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataSource implements DataSource{
    @Override
    public String[] getEmails() {
        String[] emails = {"rene@gmail.com","simon@gmail.com", "eugene@gmail.com"};
        return emails;
    }
}
