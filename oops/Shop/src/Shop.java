class Shop {
     protected String product;
     protected int quantity;
     protected int price;

     public Shop(){
          this.product= null;
          this.quantity= 0;
          this.price = 0;
     }
     public Shop(String product, int quantity, int price) {
          this.product = product;
          this.quantity = quantity;
          this.price = price;

      }

     public void setProduct(String product) {
          this.product = product;
     }
     public void setQuantity(int quantity) {
          if (quantity < 20) {
               this.quantity = quantity;
          }else{
               System.out.println("Enter Quantity below 20");
          }

     }
     public void setPrice(int price){
          if (price <= 1000){
               this.price = price;
          }else {
               System.out.println("Price is Invalid");
          }
     }

     public String getProduct() {
          return product ;
     }
     public int getQuantity() {
          return quantity;
     }
     public int getPrice() {
          return price;
     }

     public void replaceName(String product) {
          this.product = product ;

     }

     void display1() {
          System.out.println(this.getProduct());
          System.out.println(this.getQuantity());
          System.out.println(this.getPrice());
     }
      void display2() {
          System.out.println(this.product);
          System.out.println(this.quantity);
          System.out.println(this.price);
     }
}
