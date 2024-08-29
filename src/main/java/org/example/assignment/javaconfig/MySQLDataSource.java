package org.example.assignment.javaconfig;

public class MySQLDataSource implements DataSource {
    @Override
    public String[] getEmails() {
        String[] emails = {"mukesh@gmail.com","nikhil@gmail.com", "piyush@gmail.com"};
        return emails;
    }
}
