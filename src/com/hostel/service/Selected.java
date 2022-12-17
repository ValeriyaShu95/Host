package com.hostel.service;

import com.hostel.entity.Client;
import com.hostel.entity.Hotel;
import com.hostel.entity.Room;

import java.util.Scanner;

public class Selected {

    public Client selectPersone(Client[] persone) {

        System.out.println("Выберете имя"); // нужно сделать "Введите имя"
        for (Client elementClient : persone) {
            System.out.println(elementClient.getName());
        }
        Scanner choosePersone = new Scanner(System.in);
        int numberOfPersone = choosePersone.nextInt();

        int iterator2 = 0;
        for (Client element : persone) { //
            iterator2 = iterator2 + 1;

            if (numberOfPersone == iterator2) {
                return element;
            }

        }
        return null;
    }


    public Room selectRoom(Room[] rooms) {

        System.out.println("Выберете комнату");
        int iterator1 = 0;
        for (Room element : rooms) {
            iterator1 = iterator1 + 1;
            System.out.println(iterator1 + " цена номера - " + element.getPrice() + " количество человек в номере - " + element.getPersoneAmount() + " статус номера - " + element.getFreeOrNot());
        }
        Scanner chooseRoom = new Scanner(System.in);
        int numberOfRoom = chooseRoom.nextInt();


        int iterator2 = 0;
        for (Room element : rooms) { //
            iterator2 = iterator2 + 1;
            if (numberOfRoom == iterator2) {

                return element;
            }
        }
        return null;


    }

    public Client selectPersone(Client[] allPersones) {

        System.out.println("Введите ваше имя");

        Scanner choosePersone = new Scanner(System.in);
        String nameOfPersone = choosePersone.nextLine(); // итератор не нуден, тк будет String, мы не можем прированять String к итератору

        for (Client element : allPersones) {
            if (nameOfPersone == element.getName()) {
                return element;
            }
        }
        // System.out.println("Вы ввели некоррекноге имя. Введите дугое имя"); - нужно добваить бесконечный цикл while
        return null;
    }

    public Hotel selectHotel(Hotel[] allHotels) {
        System.out.println("Выберете отель");
        for (Hotel element : allHotels) {
            System.out.println(element.getHotelName());
        }

        Scanner chooseHotel = new Scanner(System.in);
        int numberOfHotel = chooseHotel.nextInt();

        int iterator4 = 0;
        for (Hotel element : allHotels) {
            iterator4 = iterator4 + 1;
            if (numberOfHotel == iterator4) {
//                System.out.println(iterator4);
                return element;

            }
        }
        return null;
    }
}




