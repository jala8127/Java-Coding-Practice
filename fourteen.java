public class fourteen {
     public static void main (String [] args) {

     // primitive datatypes
          byte by = 10;                            // 8 bit
          short sh =100;                           // 16 bit
          int i = 1000;                            // 32 bit
          long lo = 1000000 ;                      // 64 bit
          float fl = 1.0000000000f ;               // 32 bit
          double dou = 1.00000000000000000000d;    // 64 bit 
          char ch = 'z';                           // 16 bit
          boolean bool = true ; 

    // non primitive datatypes

          String str = "hello";       // 16 bit
          int Array [] = {8,5,7,9};
          class data {}


          String name = "Jala";
          System.out.println(name);
          name = name.concat("kandeswar");
          System.out.println(name);

     //operators

     //arithmetic :

          int num1 = 5;
          int num2 = 10;
          
          int add = num1 + num2 ;
          int sub = num2 - num1 ;
          int mul = num1 * num2 ;
          int div = num2 / num1 ;
          int mod = num2 % num1 ;
          
          System.out.println(add+" "+sub+" "+mul+" "+div+" "+mod );

     // relational :

          int a = 2;
          int b = 4;

          boolean isEqual = (a == b);
          boolean notEqual = (a != b);
          boolean greaterThan = (a > b) ;
          boolean lesserThan = (a < b) ;
          boolean lowerThanOrEqual =(a <= b);
          boolean higherThanOrEqual = (a >= b);

          System.out.println(isEqual);
          System.out.println(notEqual);
          System.out.println(greaterThan);
          System.out.println(lesserThan);
          System.out.println(lowerThanOrEqual);
          System.out.println(higherThanOrEqual);

     //logical
          boolean bool1 = true;
          boolean bool2 = true;

          boolean compare = (bool1 && bool2);
          System.out.println(compare);


     }    
}
