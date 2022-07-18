package deanery;

import deanery.room.FullTimeRoom;
import deanery.room.PartTimeRoom;
import deanery.room.Room;
import deanery.student.FullTimeStudent;
import deanery.student.Student;

import java.util.ArrayList;
import java.util.List;

public class RoomData {
    public static List<Room> createRooms(){
        Room fullTimeRoom1 = new FullTimeRoom("A123", 8, 16);
        Room fullTimeRoom2 = new FullTimeRoom("B123", 9, 17);
        Room partTimeRoom1 = new PartTimeRoom("C124", 9, 13);
        Room partTimeRoom2 = new PartTimeRoom("D124", 17, 20);
        List<Room> rooms = new ArrayList<>(List.of(fullTimeRoom1, fullTimeRoom2, partTimeRoom1, partTimeRoom2));
        return rooms;
    }

}
