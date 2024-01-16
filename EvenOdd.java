package ArrayProgram;

import java.util.ArrayList;

public class EvenOdd {
   public static void main(String[] args) {
      ArrayList<Integer> arraylist = new ArrayList();
      ArrayList<Integer> even = new ArrayList();
      ArrayList<Integer> odd = new ArrayList();
      arraylist.add(2);
      arraylist.add(10);
      arraylist.add(15);
      arraylist.add(19);
      arraylist.add(16);
      arraylist.add(14);
      arraylist.add(3);
      arraylist.add(20);
      arraylist.add(27);
      arraylist.add(28);

      for(int i = 0; i < arraylist.size(); ++i) {
         if ((Integer)arraylist.get(i) % 2 == 0) {
            even.add((Integer)arraylist.get(i));
         } else {
            odd.add((Integer)arraylist.get(i));
         }
      }

      System.out.println("Print Even elements: " + String.valueOf(even));
      System.out.println("Print odd elements: " + String.valueOf(odd));
   }
}
