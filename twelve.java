import java.util.*;
class person {
     private String name;
     private int age;
     private String country;

     public String getName() {
          return name;
     }
     public void setName(String name) {
          this.name = name;
     }
     
     public int getAge() {
          return age;
     }
     public void setAge(int age) {
          this.age = age;
     }

     public String getCountry() {
          return country;
     }
     public void setCountry(String country) {
          this.country = country;
     }
}

public class twelve {
     public static void main (String args[]) {
          person person = new person();

        person.setName("Jala");
        person.setAge(21);
        person.setCountry("US");

        String name = person.getName();
        int age = person.getAge();
        String country = person.getCountry();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);

     }
}