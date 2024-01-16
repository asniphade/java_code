package ArrayProgram;

public class ReverseWords {
   public static void main(String[] args) {
      String name = "Hello World";
      String rev = "";
      String[] a = name.split(" ");

      for(int i = a.length - 1; i >= 0; --i) {
         rev = rev + a[i] + " ";
      }

      System.out.println(name);
      System.out.println(rev);
   }
}
