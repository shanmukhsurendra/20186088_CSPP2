import java.util.*;

/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * main method to drive program.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        BookYourShow bys = new BookYourShow();
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < testCases; i++) {
            String[] tokens = scan.nextLine().
                replace("[", "").replace("]", "").split(",");
            String[] check = tokens[0].split(" ");
            switch (check[0]) {
                case "add":
                    int k = 2;
                    String[] seats = new String[tokens.length - 2];
                    for (int j = 0; j < seats.length; j++) {
                        seats[j] = tokens[k++];
                    }
                    bys.addAShow(new Show(check[1], tokens[1], seats));
                break;

                case "book":
                    k = 2 + 2;
                    seats = new String[tokens.length - 2 - 2];
                    for (int j = 0; j < seats.length; j++) {
                        seats[j] = tokens[k++];
                    }
                    bys.bookAShow(check[1], tokens[1],
                        new Patron(tokens[2], tokens[2 + 1]), seats);
                break;

                case "get":
                    Show show = bys.getAShow(check[1], tokens[1]);
                    if (show != null) {
                       System.out.println(show);
                    } else {
                        System.out.println("No show");
                    }
                break;

                case "print":
                    bys.printTicket(check[1], tokens[1], tokens[2]);
                break;

                case "showAll":
                    bys.showAll();
                break;

                default:
                break;
            }
        }
    }
}

class Show {
    private String movie;
    private String showTime;
    private String[] seats;

    Show (String movie, String showTime, String[] seats) {
        this.movie = movie;
        this.showTime = showTime;
        this.seats = seats;
    }

    String getMovie() {
        return movie;
    }

    String getShowTime() {
        return showTime;
    }


    String[] getSeats()  {
        return seats;
    }

    void setSeatNA(int index) {
        seats[index] = "N/A";
    }

    public String toString() {
        return movie + "," + showTime;
    }
}

class Patron {
    private String name;
    private String mobile;

    Patron (String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    String getName() {
        return name;
    }

    String getMobile() {
        return mobile;
    }

    public String toString() {
        return name + " " + mobile;
    }
}

class BookYourShow {
    ArrayList<Show> showList;
    ArrayList<String> ticketList;

    BookYourShow() {
        showList = new ArrayList<>();
        ticketList = new ArrayList<>();
    }

    void addAShow(Show show) {
        showList.add(show);
    }

    Show getAShow(String movie, String showTime) {
        for (Show show : showList)
            if (show.getMovie().equals(movie) && show.getShowTime().equals(showTime))
                return show;
        return null;
    }

    void bookAShow(String movie, String showTime, Patron patron, String[] seats) {
        Show show = getAShow(movie, showTime);
        if (show == null) {
            System.out.println("No show");
            return;
        }
        boolean flag = false;
        String[] sseats = show.getSeats();
        for (String seat : seats)
            for (int i = 0; i < sseats.length; i++)
                if (seat.equals(sseats[i])) {
                    show.setSeatNA(i);
                    flag = true;
                }


        if (flag) {
            ticketList.add(patron.getMobile()+" "+movie+" "+showTime);
        }
        // System.out.println(ticketList);
    }

    void printTicket(String movie, String showTime, String mobile) {
        String t = mobile+" "+movie+" "+showTime;
        if (ticketList.contains(t))
            System.out.println(t);
        else
            System.out.println("Invalid");
    }

    void showAll() {
        for (Show show : showList)
            System.out.println(show.toString() + "," + Arrays.toString(show.getSeats()).replace(" ",""));
    }
}