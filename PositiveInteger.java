package ArrayProgram;

import java.util.Scanner;

public class PositiveInteger {
   public static void main(String[] args) {
      Scanner dhanu = new Scanner(System.in);
      System.out.println("Enter Your Positive Number : ");
      int num = dhanu.nextInt();
      System.out.println(num);

      for(int i = 1; i <= 10; ++i) {
         System.out.println(i * num);
      }

   }
}
