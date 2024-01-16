package ArrayProgram;

import java.util.Scanner;

public class FactorialWhile {
   public static void main(String[] args) {
      Scanner dhanu = new Scanner(System.in);
      System.out.println("Enter Your  Number : ");
      int num = dhanu.nextInt();

      int fact;
      for(fact = 1; num != 0; --num) {
         fact *= num;
      }

      System.out.println(fact);
   }
}
