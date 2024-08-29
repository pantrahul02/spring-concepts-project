package org.example.assignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgressSQLDataSource implements DataSource{
    @Override
    public String[] getEmails() {
        String[] emails = {"rene@gmail.com","simon@gmail.com", "eugene@gmail.com"};
        return emails;
    }
}
