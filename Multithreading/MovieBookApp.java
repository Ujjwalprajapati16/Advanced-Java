// package Multithreading;

class BookThreaterSeat {
    static int total_seats = 20;

    synchronized static void bookSeat(int seats) {
        if (total_seats >= seats) {
            System.out.println(seats + " seats booked successfully.");
            total_seats = total_seats - seats;
            System.out.println("seats left " + total_seats);
        } else {
            System.out.println(seats + " seats can't booked...!!");
            System.out.println("seats left " + total_seats);
        }
    }
}

public class MovieBookApp extends Thread {
    public static BookThreaterSeat b;
    public static BookThreaterSeat b2;
    int seats;

    public MovieBookApp(BookThreaterSeat b) {
        this.b = b;
    }

    public void run() {
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b = new BookThreaterSeat();

        MovieBookApp app = new MovieBookApp(b);
        app.seats = 7;
        app.start();

        MovieBookApp app1 = new MovieBookApp(b);
        app1.seats = 6;
        app1.start();

        b2 = new BookThreaterSeat();

        MovieBookApp app2 = new MovieBookApp(b2);
        app2.seats = 9;
        app2.start();

        MovieBookApp app3 = new MovieBookApp(b2);
        app3.seats = 5;
        app3.start();

    }
}
