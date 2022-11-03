package com.hostel.entity;

public class Room {

    public Integer personeNumber;
    public Integer price;
    public String freeOrNot;

    public Integer getPersoneAmount() {
        return personeNumber;
    }

    public void setPersoneNumber(Integer personeNumber) {
        this.personeNumber = personeNumber;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getFreeOrNot() {
        return freeOrNot;
    }

    public void setFreeOrNot(String freeOrNot) {
        this.freeOrNot = freeOrNot;
    }

    public Room(Integer personeNumber, Integer price, String freeOrNot) {
        this.personeNumber = personeNumber;
        this.price = price;
        this.freeOrNot = freeOrNot;


    }
}
