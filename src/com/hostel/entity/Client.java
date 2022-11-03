package com.hostel.entity;

public class Client {
    private String name;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String gender;
    private Bill bill;



    public Client(String name, String lastName, String phoneNumber, String email, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Bill getBill() {
        return bill;
    }

    public void setGender(Bill bill) {
        this.bill = bill;
    }
}
