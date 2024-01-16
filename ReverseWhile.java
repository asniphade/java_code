package ArrayProgram;

import java.util.Scanner;

public class ReverseWhile {
   public static void main(String[] args) {
      Scanner dhanu = new Scanner(System.in);
      System.out.println("Enter Your Number : ");
      int num = dhanu.nextInt();

      int rev;
      for(rev = 0; num != 0; num /= 10) {
         rev = rev * 10 + num % 10;
      }

      System.out.println("Print Reverse Number : " + rev);
   }
}
