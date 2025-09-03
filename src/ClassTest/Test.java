//Cab - 500 CAB101 at 10:00 and cancels refund 300
//Train - 1200 TRN202 train is confirmed and later cancel refund 1000
//Bus - 200 BUS303 no facility to cancel



package ClassTest;

abstract class Booking {
    double amount;
    String transactionId;

    Booking(double amount, String transactionId) {
        this.amount = amount;
        this.transactionId = transactionId;}

    void generateReceipt() {
        System.out.println("Receipt: Txn " + transactionId + " for amount " + amount);
    }
    abstract void processPayment();
}
interface Refundable {
    void refund(double amount);
}
interface Cancelable {
    void cancel();
}

class Cab extends Booking implements Refundable, Cancelable {
    Cab(double amount, String transactionId) {
        super(amount, transactionId);
    }

    @Override
    public void cancel() {
        System.out.println("Cab cancelled");
    }
}

class train extends Booking implements Refundable, Cancelable {
    train(double amount, String transactionId) {
        super(amount, transactionId);
    }
    @Override
    public void cancel() {
        System.out.println("Train cancelled");
    }
}
class Bus extends Booking implements Refundable {
    Bus(double amount, String transactionId) {
        super(amount, transactionId);
    }
}


public class Test {
    public static void main(String[] args) {
        Cab cab = new Cab(500, "CAB101");
        train train = new train(1200, "TRN202");
        Bus bus = new Bus(200, "BUS303");
        cab.processPayment();
        train.processPayment();
        bus.processPayment();
        cab.cancel();
        train.cancel();
        cab.refund(300);
        train.refund(1000);
        bus.refund(200);
        cab.generateReceipt();
        train.generateReceipt();
        bus.generateReceipt();

    }
}

