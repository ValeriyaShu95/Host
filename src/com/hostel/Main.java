package com.hostel;

import com.hostel.entity.Bill;
import com.hostel.entity.Client;
import com.hostel.entity.Hotel;
import com.hostel.entity.Room;
import com.hostel.service.BookingService;
import com.hostel.service.Selected;

import java.awt.print.Book;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bill persone1Bill = new Bill(200);
        Client persone1 = new Client("Max", "Shush", "+7999999999", "Max@mail.ru", "male", persone1Bill);

        Bill persone2Bill = new Bill(30000);
        Client persone2 = new Client("Lera", "Shush", "+788888888", "lera@mail.com", "female", persone2Bill);


        Room[] hotel1Room = new Room[]{new Room(2, 2000, "free"), new Room(3, 1000, "not free")};
        Hotel hotel1 = new Hotel("Vegas", hotel1Room);

        Room[] hotel2Room = new Room[]{new Room(1, 5000, "not free")}; //Все комнаты будут not free?
        Hotel hotel2 = new Hotel("Plasa", hotel2Room); // что это?

        Room[] hotel3Room = new Room[]{new Room(5, 10000, "free")};
        Hotel hotel3 = new Hotel("Mariya", hotel3Room);

        Room[] hotel4Room = new Room[]{new Room(7, 10500, "free")};
        Hotel hotel4 = new Hotel("Leroy", hotel4Room);


        Hotel[] allHotels = new Hotel[] {hotel1,hotel2,hotel3,hotel4};

        Client [] allPers = new  Client[] {persone1, persone2};

        Selected selected = new Selected();
        Client selectPersone = selected.selectPersone(allPers); //  allPers - пишем только название массива без "[]"
        Hotel selectedHotel = selected.selectHotel(allHotels);
        Room selectedRoom = selected.selectRoom(selectedHotel.getRooms());


        BookingService booking = new BookingService();
        booking.Booking(hotel1, persone1, selectedRoom);


    }
}
