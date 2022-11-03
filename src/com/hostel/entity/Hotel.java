package com.hostel.entity;

public class Hotel {

    private String hotelName;
    //private Integer roomList;
    private Room [] rooms; //почему массив?




    public Hotel(String hotelName, Room[] rooms) {
        this.hotelName = hotelName;
        //this.roomList = roomList;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

   // public Integer getRoomList() {
     //   return roomList;

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    //public void setRoomList(Integer roomList) {
        //this.roomList = roomList;

    }

