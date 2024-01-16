package loopsprogram;

public class SwapString {
   public static void main(String[] args) {
      String strA = "Hello";
      String strB = "World";
      System.out.println("First String " + strA);
      System.out.println("Second String " + strB);
      strA = strA + strB;
      strB = strA.substring(0, strA.length() - strB.length());
      strA = strA.substring(strB.length(), strA.length());
      System.out.println("First String " + strA);
      System.out.println("Second String " + strB);
   }
}
