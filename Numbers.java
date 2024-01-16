package loopsprogram;

public class Numbers {
   public static void main(String[] args) {
      int counter = 0;

      int c;
      int j;
      for(c = 1; c <= 4; ++c) {
         for(j = 3; j >= c; --j) {
            System.out.print(" ");
         }

         for(j = 1; j <= c; ++j) {
            ++counter;
            System.out.print(counter);
         }

         System.out.println();
      }

      c = 0;

      for(j = 1; j <= 5; ++j) {
         c += 2;
         System.out.print(" " + c);
      }

   }
}
