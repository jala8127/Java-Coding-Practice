
public class App {
    public static void main(String[] args) {
        Shop item1 = new Shop("Books", 10, 500) ;
        Shop item2 = new Shop();
        Wholesale items = new Wholesale();

        item2.setProduct("Bottles");
        item2.setQuantity(15);
        item2.setPrice(500);


        item1.display2();
        item2.display1();
        
        item1.setProduct("trees");
        item1.display2();
        
        item1.replaceName("Phones");
        item1.display2();
        
        System.out.println();
        items.setProduct("Laptop");
        items.setQuantity(30);
        items.setPrice(300);
        items.display();
        
        System.out.println();
        items.replace("Bags",60);
        items.display();
        
        System.out.println() ;
        items.replace("glass",80,100) ;
        items.display() ;



    }
}
