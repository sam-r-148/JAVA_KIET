package ClassTest;

interface Booking {
    void book();
    void cancel();
}

interface Ride {
    int id = 0;
    int price = 0;


}
abstract class CabRide implements Booking, Ride {
    int id;

    int price;
    public void book() {
        System.out.println("Cab " + id + " booked. Price: " + price);
    }
    public void cancel() {
        int refund = price - 100;
        System.out.println("Cab " + id + " cancelled. Refund: " + refund);
    }
}
abstract class TrainRide implements Booking, Ride {
    int id;

    int price;

    public void book() {
        System.out.println("Train " + id + " booked. Price: " + price);
    }

    public void cancel() {
        int refund = price - 200;
        System.out.println("Train " + id + " cancelled. Refund: " + refund);
    }
}



abstract class BusRide implements Booking, Ride {
    int id;
    int price;
    public void book() {
        System.out.println("Bus " + id + " booked. Price: " + price);
    }
    public void cancel() {

        System.out.println("Bus " + id + " cancelled. No refund");
    }
}

public class Test {
    public static void main(String[] args) {

        CabRide cab = new CabRide() {
            {

            id =1;
            price =500;
        }
        };

        TrainRide train = new TrainRide() {
            {
                id = 2;
                price = 1000;}
        };

        BusRide bus = new BusRide() {
            {
                id = 3;
                price = 200;
            }};

        try {
            cab.book();
            cab.cancel();
        } catch (Exception e) {
            System.out.println("Error in cab");
        }
        try {
            train.book();
            train.cancel();
        } catch (Exception e) {
            System.out.println("Error in train");
        }
        try {
            bus.book();
            bus.cancel();
        } catch (Exception e) {
            System.out.println("Error in bus");
        }
    }
}
