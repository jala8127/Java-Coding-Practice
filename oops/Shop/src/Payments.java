abstract class Payments {
     abstract void card();
     abstract void upi();
     abstract void cash();
}

class OnlinePayments extends Payments{
     @Override
     void card() {
          System.out.println("Card payment processed at counter.");
     }
     
     @Override
     void upi() {
          System.out.println("UPI not available for offline payments.");
     }
     
     @Override
     void cash() {
          System.out.println("Cash payment accepted.");
     }
}
class OfflinePayments extends Payments {
     @Override
     void card() {
          System.out.println("Card payment done online.");
     }
     @Override
     void upi() {
          System.out.println("UPI payment done through mobile app.");
     }
     @Override
     void cash() {
          System.out.println("Cash not allowed for online payment.");
     }
}