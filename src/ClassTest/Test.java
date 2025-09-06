package ClassTest;

abstract class Payments{
    double amount;
    String id;
    Payments(double amount,String id){
        this.amount = amount;
        this.id = id;
    }
    void generateReceipt(){
        System.out.println("Transaction id: " + id + "is Generated for amount :" + amount );
    }
    abstract void pay();
}
interface Refundable{
    void refund(double amount);
}
interface CancelRide{
    void cancelRide();
}

class Cab extends Payments implements Refundable,CancelRide{
    Cab(double amount,String id){
        super(amount,id);
    }
    @Override
    public void refund(double amount){
        System.out.println("The Refunded Amount for Cancelling ride is : 300" );
    }
    @Override
    public void cancelRide(){
        System.out.println("Ride Got Cancelled");
    }
    @Override
    public void pay(){
        System.out.println("Car booking payment of " + amount + " done for booking " + id);
    }
}
class Train extends Payments implements Refundable,CancelRide{
    Train(double amount,String id){
        super(amount,id);
    }
    @Override
    void pay() {
        System.out.println("Payment of " + amount + " done for train booking " + id);
    }
    public void refund(double amount){
        System.out.println("The Refunded Amount for Cancelling Ticket is : 960");
    }
    @Override
    public void cancelRide() {
        System.out.println("Train with booking " + id + " got cancelled");
    }

}

class Bus extends Payments {
    Bus(double amount, String id) {
        super(amount, id);
    }

    @Override
    void pay() {
        System.out.println("Bus booking payment of " + amount + " done for booking " + id);
    }

    @Override
    void generateReceipt() {
        System.out.println("Bus ticket generated with booking ID: " + id + " for amount: " + amount);
    }
}

public class Test {
    public static void main(String[] args) {
        Cab carBooking = new Cab(500, "CAB101");
        carBooking.pay();
        carBooking.generateReceipt();
        carBooking.cancelRide();
        carBooking.refund(500);

        System.out.println();

        Train trainBooking = new Train(1200, "TRN202");
        trainBooking.pay();
        trainBooking.generateReceipt();
        trainBooking.cancelRide();
        trainBooking.refund(1200);

        System.out.println();

        Bus busBooking = new Bus(200, "BUS303");
        busBooking.pay();
        busBooking.generateReceipt();
    }
}