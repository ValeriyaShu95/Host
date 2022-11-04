package com.hostel.service;

import com.hostel.entity.Room;

public class Selected {

    public Room selectedRoom(Room[] rooms, Integer ppp) {
        int a = 0;
        for (Room element : rooms) {
            a = a+1;
            if (ppp == a) {
                return element;
            }
        }
        return null;
    }
}
