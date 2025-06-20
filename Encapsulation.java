import java.util.*;
 class Books {
     private String title;
     private int stock ;
     private int price;

// Setters
     public void setTitle (String title) {
          this.title = title;
     }
     public void setStock (int stock) {
          this.stock = stock ;
     }
     public void setPrice (int price) {
          this.price = price ;
     }

//getters
     public String getTitle() {
          return title ;
     }
     public int getStock() {
          return stock ;
     } 
     public int getPrice() {
          return price ;
     }
     
     public void display() {
          System.out.println(this.getTitle());
          System.out.println(this.getStock());
          System.out.println(this.getPrice());
         
     }

}
public class Encapsulation {
     public static void main(String []args) {
          Books book = new Books();

          book.setTitle("Harry potter");
          book.setStock(20);
          book.setPrice(100);

          book.display();

     }
}
