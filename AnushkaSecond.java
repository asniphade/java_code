package loopsprogram;

public class AnushkaSecond {
   public static void main(String[] args) {
      for(int i = 1; i <= 11; ++i) {
         int k;
         if (i <= 6) {
            for(k = 1; k <= i; ++k) {
               System.out.print(" * ");
            }
         } else {
            for(k = i; k <= 11; ++k) {
               System.out.print(" * ");
            }
         }

         System.out.println();
      }

   }
}
