package com.hostel.service;
import com.hostel.entity.Bill;
import com.hostel.entity.Client;
import com.hostel.entity.Hotel;
import com.hostel.entity.Room;

public class BookingService {
    public void Booking(Hotel hotel, Client client, Room room) {  // почему Hotel hotel

        boolean statusCheck = AmmountCheck(client.getBill(), room.getPrice());
        if (statusCheck == true) {

            Integer finaleBalance = client.getBill().getAmount() - room.getPrice();

            System.out.println(client.getName() + " " + "Вы забронировали отель" + " " + hotel.getHotelName() + " " + "Ваш номер -" + " " + room.hashCode() + "\n"
                    + "Остаток на вашем счете - " + " " + finaleBalance);
        }
        else
            System.out.println("На вашем счете не достаточно денег");

    }

    public boolean AmmountCheck(Bill clientBill, Integer roomPrice) {
        if (clientBill.getAmount() >= roomPrice) {
            return true;
        }
        else

        return false;
    }
}
