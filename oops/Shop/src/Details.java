interface Orders  {
     void orederDetails();
}
interface Users   {
     void userDetails();
}

class Details implements Orders,Users {

     public void userDetails() {
          System.out.println("user details collected");
     }

     public void orederDetails() {
          System.out.println("order detailscollected");
     }
     
}