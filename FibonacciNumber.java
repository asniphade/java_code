package loopsprogram;

import java.util.Scanner;

public class FibonacciNumber {
   public static void main(String[] args) {
      System.out.println("Enter your number:");
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      printValue(number);
   }

   private static void printValue(int number) {
      int a = 0;
      int b = 1;
      int c = false;

      for(int i = 1; i <= number; ++i) {
         System.out.println(a);
         int c = a + b;
         a = b;
         b = c;
      }

   }
}
