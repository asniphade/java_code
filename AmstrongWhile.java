package ArrayProgram;

import java.util.Scanner;

public class AmstrongWhile {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your Number");
      int num = sc.nextInt();
      int i = 1;
      int sum = 0;

      int number;
      for(number = num; i <= num; num /= 10) {
         int a = num % 10;
         sum += a * a * a;
      }

      System.out.println(sum);
      if (number == sum) {
         System.out.println("It's Amstrong Number");
      } else {
         System.out.println("It's not Amstrong Number");
      }

   }
}
