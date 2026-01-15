package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Students")
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // birer birer otomatik artmasını sağlar
    private Integer id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "birth_of_date", nullable = true)
    private Date birtofDate;

    public Student(Integer id, String firstName, String lastName, Date birtofDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birtofDate = birtofDate;
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
