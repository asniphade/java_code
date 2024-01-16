package ArrayProgram;

import java.util.Scanner;

public class SumEvenOdd {
   public static void main(String[] args) {
      Scanner dhanu = new Scanner(System.in);
      System.out.println("Enter Your Numbers : ");
      int num = dhanu.nextInt();
      int even = 0;
      int odd = 0;

      for(int i = 1; i <= num; ++i) {
         if (i % 2 == 0) {
            even += i;
         } else {
            odd += i;
         }
      }

      System.out.println(even);
      System.out.println(odd);
   }
}
