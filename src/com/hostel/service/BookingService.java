package com.hostel.service;
import com.hostel.entity.Bill;
import com.hostel.entity.Client;
import com.hostel.entity.Hotel;
import com.hostel.entity.Room;

public class BookingService {
    public void Booking (Hotel hotel, Client client, Room room) {  // почему Hotel hotel
        System.out.println(client.getName() + "" + "Вы забронировали отель" + "" + hotel.getHotelName() + "" + "Ващ номер -" + "" + room.hashCode());


    }
    public void AmmountCheck (Bill bill  ){

    }

}
