package com.example.demo.dto;

public class DtoStudent {

    private String firstName;
    private String lastName;

    public DtoStudent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public DtoStudent() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
