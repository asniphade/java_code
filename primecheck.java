package loopsprogram;

public class primecheck {
   public static void main(String[] args) {
      int num = 0;
      int flag = true;
      if (num != 1 && num != 0) {
         int i = 2;
         if (i < num) {
            flag = false;
         }

         if (flag) {
            System.out.println("This is prime number");
         }
      } else {
         System.out.println("This is not Prime");
      }

   }
}
