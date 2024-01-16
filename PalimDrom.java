package loopsprogram;

import java.util.Scanner;

public class PalimDrom {
   public static void main(String[] args) {
      System.out.println("Enter ur Number: ");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      printValue(num, num);
   }

   private static void printValue(int num, int check) {
      int reverse;
      for(reverse = 0; num != 0; num /= 10) {
         reverse = reverse * 10 + num % 10;
      }

      System.out.println(reverse);
      if (check == reverse) {
         System.out.println("It is Palimdrom");
      } else {
         System.out.println("It's  not  Palimdrom");
      }

   }
}
