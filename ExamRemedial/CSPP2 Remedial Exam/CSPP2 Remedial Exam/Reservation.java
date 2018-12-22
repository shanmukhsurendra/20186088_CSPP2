/*
  Reservation class, stores the person and room number in the Hotel
*/
import java.util.Arrays;

public class Reservation {
    //instance variables
    private String name;
    private int roomNumber;

    //constructors, must supply the name, and optionally a room
    public Reservation(String person) {
        this.name = person;

    }
    public Reservation(String person, int room) {
        this.name = person;
        this.roomNumber = room;

    }

    //mutators, set the room number or name
    public void setRoom(int newroom) {
        this.roomNumber = newroom;
    }

    public void setName(String newname) {
        this.name = newname;
    }

    //accessors, return the room number or name
    public int getRoom() {
        return this.roomNumber;
    }

    public String getName() {
        return this.name;
    }
}
class Hotel {
    Hotel() {

    }
    String[] reservearra = new String[2 + 2 + 1];
    int size = 0;
    public int reserveRoom(String person) {
        for (int i = 0; i < reservearra.length; i++) {
            if (reservearra[i] != null) {

            } else {
                reservearra[i] = person;
                size++;
                int j = i + 1;
                return  j;
            }
        }
        return -1;
    }
    public boolean reserveRoom(String person, int roomNum) {
        if (size < reservearra.length && reservearra[roomNum - 1] != null) {
            System.out.println("Room is already reserved");
            return false;
        } else if (size == reservearra.length) {
            System.out.println("All Rooms are reserved");
            return false;
        }
        int k = roomNum - 1;
        reservearra[k] = person;
        size++;
        return true;
    }
    public void printReservations() {
        for (int i = 0; i < reservearra.length; i++) {
            if (reservearra[i] != null) {
                int j = i + 1;
                System.out.println(this.reservearra[i] + " " + j);
            }
        }
    }
    public void cancelReservations(String person) {
        for( int j = 0 ;j < reservearra.length; j++) {
            if(reservearra[j].equals(person)) {
                reservearra[j] = null;
                size--;
            }
        }
    }
    public boolean buildRooms(int num) {
        reservearra = Arrays.copyOf(reservearra, reservearra.length * 2);
        return true;
    }
}