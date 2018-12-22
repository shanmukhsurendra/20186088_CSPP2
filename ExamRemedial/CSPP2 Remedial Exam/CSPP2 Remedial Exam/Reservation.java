/*
  Reservation class, stores the person and room number in the Hotel
*/
import java.util.Arrays;
/**
 * Class for reservation.
 */
public class Reservation {
    /**
     * creates the name.
     */
    private String name;
    /**
     * creates the roonNumber.
     */
    private int roomNumber;

    //constructors, must supply the name, and optionally a room

    /**
     * Constructs the object.
     *
     * @param      person  The person
     */
    public Reservation(final String person) {
        this.name = person;

    }
    /**
     * Constructs the object.
     *
     * @param      person  The person
     * @param      room    The room
     */
    public Reservation(final String person, final int room) {
        this.name = person;
        this.roomNumber = room;

    }

    /**
     * Sets the room.
     *
     * @param      newroom  The newroom
     */

    public void setRoom(final int newroom) {
        this.roomNumber = newroom;
    }
    /**
     * Sets the name.
     *
     * @param      newname  The newname
     */
    public void setName(final String newname) {
        this.name = newname;
    }

    /**
     * Gets the room.
     *
     * @return     The room.
     */
    public int getRoom() {
        return this.roomNumber;
    }
    /**
     * Gets the name.
     *
     * @return     The name.
     */
    public String getName() {
        return this.name;
    }
}
/**
 * Class for hotel.
 */
class Hotel {
    /**
     * intialises the string array.
     */
    private String[] reservearra;
    /**
     * initialises the size integer.
     */
    private int size;
    /**
     * Constructs the object.
     */
    Hotel() {
        reservearra = new String[2 + 2 + 1];
        size = 0;
    }
    /**
     * reerves room for a person.
     *
     * @param      person  The person
     *
     * @return     { description_of_the_return_value }
     */
    public int reserveRoom(final String person) {
        for (int i = 0; i < reservearra.length; i++) {
            if (reservearra[i] != null) {
                int z = 0+1;
            } else {
                reservearra[i] = person;
                size++;
                int j = i + 1;
                return  j;
            }
        }
        return -1;
    }
    /**
     * reserve particular room for person.
     *
     * @param      person   The person
     * @param      roomNum  The room number
     *
     * @return     { description_of_the_return_value }
     */
    public boolean reserveRoom(final String person, final int roomNum) {
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
    /**
     * print the entire reservations.
     */
    public void printReservations() {
        for (int i = 0; i < reservearra.length; i++) {
            if (reservearra[i] != null) {
                int j = i + 1;
                System.out.println(this.reservearra[i] + " " + j);
            }
        }
    }
    /**
     * cancel the reservations for particular person.
     *
     * @param      person  The person
     */
    public void cancelReservations(final String person) {
        for (int j = 0; j < reservearra.length; j++) {
            if (reservearra[j].equals(person)) {
                reservearra[j] = null;
                size--;
            }
        }
    }
    /**
     * Builds rooms.
     *
     * @param      num   The number
     *
     * @return     The rooms.
     */
    public boolean buildRooms(final int num) {
        reservearra = Arrays.copyOf(reservearra, reservearra.length * 2);
        return true;
    }
}


