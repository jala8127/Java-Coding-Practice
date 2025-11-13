public class Product {
    public int product_id;
    public String name;
    public int price;

    public Product(int product_id, String name, int price) {
        this.product_id = product_id;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }


    public String toString() {
        return
                "product_id=" + product_id +
                ", name='" + name +
                ", price=" + price ;
    }
}
