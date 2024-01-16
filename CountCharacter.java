package ArrayProgram;

public class CountCharacter {
   public static void main(String[] args) {
      String name = "anushka";
      int count = 0;
      Character ch = 'a';

      for(int i = 0; i < name.length(); ++i) {
         Character k = name.charAt(i);
         if (k.equals(ch)) {
            ++count;
         }
      }

      System.out.println(count);
   }
}
