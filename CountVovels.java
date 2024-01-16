package ArrayProgram;

public class CountVovels {
   public static void main(String[] args) {
      String name = "Anushka";
      int count = 0;

      for(int i = 0; i < name.length(); ++i) {
         Character k = name.charAt(i);
         if (k.equals('a') || k.equals('e') || k.equals('i') || k.equals('o') || k.equals('u')) {
            ++count;
         }
      }

      System.out.println(count);
   }
}
