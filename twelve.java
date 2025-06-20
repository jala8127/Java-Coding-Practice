import java.util.*;
import java.lang.Exception;

class invalidAge extends Exception{
     public invalidAge(String message){
          super(message);
     }
}
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
     public void setAge(int age) throws invalidAge {
          if(age<150)
               this.age = age;
          else
             throw new invalidAge( "Age is invalid");
     }
     public String getCountry() {
          return country;
     }
     public void setCountry(String country) {
          this.country = country;
     }

}

public class twelve {
     public static void main (String args[]) throws Exception {
        person person = new person();
         
        person.setName("Jala");
        person.setAge(240);
        person.setCountry("US");

        String name = person.getName();
        int age = person.getAge();
        String country = person.getCountry();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);

     }
}