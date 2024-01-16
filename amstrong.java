package loopsprogram;

import java.util.Scanner;

public class amstrong {
   public static void main(String[] args) {
      System.out.println("Enter your number:");
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      int sum = 0;
      printValue(number, sum);
   }

   private static void printValue(int number, int sum) {
      for(int i = 1; i <= 3; ++i) {
         int a = number % 10;
         sum += a * a * a;
         number /= 10;
      }

      System.out.println(sum);
      if (number == sum) {
         System.out.println("It's Amstrong Number");
      } else {
         System.out.println("It's not Amstrong Number");
      }

   }
}
