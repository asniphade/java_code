package loopsprogram;

public class FourFiveSix {
   public static void main(String[] args) {
      for(int i = 1; i <= 5; ++i) {
         int k;
         for(k = 1; k <= i; ++k) {
            System.out.print("  ");
         }

         for(k = 5; k >= i; --k) {
            System.out.print(" * ");
         }

         System.out.println();
      }

   }
}
