package loopsprogram;

public class FouthProgram {
   public static void main(String[] args) {
      for(int i = 1; i <= 5; ++i) {
         int j;
         for(j = 5; j >= i; --j) {
            System.out.print(" ");
         }

         for(j = 1; j <= i; ++j) {
            System.out.print(" * ");
         }

         System.out.println();
      }

   }
}
