class Wholesale extends Shop{
     @Override
     public void setQuantity(int quantity) {
          super.setQuantity(quantity);
          if (quantity > 50) {
               this.quantity = quantity;
          }else{
               System.out.println("Enter Quantity above 50");
          }
     }
     public void display() {
          System.out.println(this.getProduct());
          System.out.println(this.getQuantity());
          System.out.println(this.getPrice());
     }

     public void replace (String product ,int quantity) {
          super.product = product;
          super.quantity = quantity;
     }
     public void replace (String product,int quantity,int price) {
          super.product = product;
          super.quantity = quantity;
          super.price = price;

     }
}

