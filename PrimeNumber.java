package loopsprogram;

public class PrimeNumber {
   public static void main(String[] args) {
      int number = 17;
      int flag = true;

      for(int i = 2; i < number; ++i) {
         if (number % i == 0) {
            System.out.println("This is not Prime Number");
            flag = false;
            break;
         }
      }

      if (flag) {
         System.out.println("This is Prime Number");
      }

   }
}
