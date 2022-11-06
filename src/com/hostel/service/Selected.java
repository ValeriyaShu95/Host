package com.hostel.service;

import com.hostel.entity.Hotel;
import com.hostel.entity.Room;

import java.util.Scanner;

public class Selected {

    public Room selectRoom(Room[] rooms) {

        System.out.println("Выберете комнату");
        for (Room element : rooms) {
            System.out.println("1 - " + element.getPrice() + element.getPersoneAmount() + element.getFreeOrNot());
        }
        Scanner chooseRoom = new Scanner(System.in);
        int numberOfRoom = chooseRoom.nextInt();

        int iterator = 0;
        for (Room element : rooms) { //
            iterator = iterator + 1;
            if (numberOfRoom == iterator) {
                return element;
            }
        }
        return null;


    }
}

