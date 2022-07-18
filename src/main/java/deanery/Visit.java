package deanery;

import deanery.exception.WrongHour;
import deanery.exception.WrongNumber;
import deanery.room.Room;
import deanery.student.Student;

import java.util.List;


public class Visit {
    static List<Room> rooms = RoomData.createRooms();
    public static void visitation(Student student, String visitRoom, Integer visitHour)
        throws WrongNumber, WrongHour {
        for(int i =0; i< rooms.size(); i++){
            if(visitRoom.equals(rooms.get(i).getNumber()) && student.getType().equals(rooms.get(i).getType())){

                if(visitHour >= rooms.get(i).getOpen() && visitHour<=rooms.get(i).getClose()){
                    return;
                }
                else{
                    throw new WrongHour("Wrong hour");
                }
            }

            }throw new WrongNumber("Wrong number");
        }

    }

