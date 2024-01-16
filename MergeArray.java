package ArrayProgram;

import java.util.ArrayList;

public class MergeArray {
   public static void main(String[] args) {
      ArrayList<Integer> arraylist = new ArrayList();
      ArrayList<Integer> number = new ArrayList();
      arraylist.add(10);
      arraylist.add(20);
      arraylist.add(30);
      arraylist.add(40);
      arraylist.add(50);
      number.add(60);
      number.add(70);
      number.add(80);
      number.add(90);
      number.add(100);
      System.out.println("Print First arrayList:" + String.valueOf(arraylist));
      System.out.println("Print Second arrayList:" + String.valueOf(number));

      for(int i = 0; i < number.size(); ++i) {
         arraylist.add((Integer)number.get(0));
      }

      System.out.println("Print First arrayList:" + String.valueOf(arraylist));
   }
}
