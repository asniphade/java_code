package loopsprogram;

public class ReverseNumber {
   public static void main(String[] args) {
      int num = 12345;
      int reverse = 0;

      for(int i = 1; i <= 5; ++i) {
         reverse = reverse * 10 + num % 10;
         num /= 10;
      }

      System.out.print("Enter reverse Number: " + reverse);
   }
}
