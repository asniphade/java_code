package ArrayProgram;

import java.util.ArrayList;

public class ReverseArray {
   public static void main(String[] args) {
      ArrayList<Integer> arraylist = new ArrayList();
      ArrayList<Integer> reverse = new ArrayList();
      arraylist.add(10);
      arraylist.add(20);
      arraylist.add(30);
      arraylist.add(40);
      arraylist.add(50);

      for(int i = arraylist.size() - 1; i >= 0; --i) {
         reverse.add((Integer)arraylist.get(i));
      }

      System.out.println("Print Original ArrayList: " + String.valueOf(arraylist));
      System.out.println("Print Reverse ArrayList: " + String.valueOf(reverse));
   }
}
