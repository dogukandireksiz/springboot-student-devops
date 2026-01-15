package com.example.demo.dto;

import java.util.Date;

public class DtoStudentIU {

    private String firstName;
    private String lastName;
    private Date birtofDate;

    public DtoStudentIU(String firstName, String lastName, Date birtofDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birtofDate = birtofDate;
    }

    public DtoStudentIU() {
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

    public Date getBirtofDate() {
        return birtofDate;
    }

    public void setBirtofDate(Date birtofDate) {
        this.birtofDate = birtofDate;
    }
}
