import java.util.*;

abstract class Payments {
    abstract void paymentMode() ;
}

class Upi extends Payments {
    @Override
    void paymentMode() {
        System.out.println("Enter your UPI ID");
    }
}

class Card extends Payments {
    @Override
    void paymentMode() {
        System.out.println("Enter your card number");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mode of Payment: \n1. UPI\n2. Card");
        int a = sc.nextInt();

        Payments mode;

        if (a == 1) {
            mode = new Upi();
            mode.paymentMode();
        } else if (a == 2) {
            mode = new Card();
            mode.paymentMode();
        } else {
            System.out.println("Invalid mode of payment");
        }

        sc.close();
    }
}