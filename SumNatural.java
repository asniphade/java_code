package ArrayProgram;

public class SumNatural {
   public static void main(String[] args) {
      int num = 1;

      int sum;
      for(sum = 0; num <= 10; ++num) {
         sum += num;
      }

      System.out.println(sum);
   }
}
