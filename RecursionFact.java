package loopsprogram;

import java.util.Scanner;

public class RecursionFact {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number:");
      int num = sc.nextInt();
      printValue(num);
      int ans = printValue(num);
      System.out.println(ans);
   }

   private static int printValue(int num) {
      if (num == 1) {
         return 1;
      } else {
         int iOutput = num * printValue(num - 1);
         return iOutput;
      }
   }
}
