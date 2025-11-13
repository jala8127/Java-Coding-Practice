import java.util.*;
public class Generics {
    public static void main(String[] args){
       List<Integer> arr=new ArrayList<>();
       arr.add(1);
       arr.add(15);
       System.out.println(arr);

       //Object Type
        List<Object> arr1=new ArrayList<>();
        arr1.add(1);
        arr1.add("Hello");
        arr1.add(1.90);
        arr1.add(true);
        System.out.println(arr1);

        //User-defined class type
        List<Product> p=new ArrayList<>();
        Product p3=new Product(2,"bus",50000000);
        Product p1=new Product(1,"Bag",5666);
        Product p2=new Product(2,"Ball",50);
        p.add(p1);
        p.add(p2);
        arr1.add(p3);
        for(Product prod:p)
            System.out.println(prod);

        System.out.println(arr1);



    }


}
