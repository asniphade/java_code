package loopsprogram;

public class ThirdLoop {
   public static void main(String[] args) {
      for(int i = 1; i <= 10; ++i) {
         int k;
         if (i <= 5) {
            for(k = 1; k <= i; ++k) {
               System.out.print(" * ");
            }
         } else {
            for(k = i; k <= 10; ++k) {
               System.out.print(" * ");
            }
         }

         System.out.println();
      }

   }
}
