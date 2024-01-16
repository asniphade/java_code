package loopsprogram;

public class SpaceCount {
   public static void main(String[] args) {
      String input = "this is a cat";
      int count = 0;

      for(int i = 0; i < input.length(); ++i) {
         Character k = input.charAt(i);
         if (k.equals(' ')) {
            ++count;
            System.out.println("Find Index Of Space:" + i);
         }
      }

      System.out.println(count);
   }
}
