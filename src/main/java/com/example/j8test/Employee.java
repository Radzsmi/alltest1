package com.example.j8test;

public class Employee {


    public Employee(Integer id, String firstName, String lastName, String email) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    private Integer id;
    private String firstName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String lastName;
    private String email;

    //Getters and setters
    public void setId(Integer i){id=i;}
    public Integer getId(){return id;}
    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ",lastName=" + lastName + ", email=" + email + "]";
    }
}