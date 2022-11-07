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
        for (Room element : rooms) {
            System.out.println("1 - " + element.getPrice() + element.getPersoneAmount() + element.getFreeOrNot());
        }
        Scanner chooseRoom = new Scanner(System.in);
        int numberOfRoom = chooseRoom.nextInt();

        int iterator1 = 0;
        for (Room element : rooms) { //
            iterator1 = iterator1 + 1;

            if (numberOfRoom == iterator1) {
                return element;
            }
        }
        return null;


    }
}
