package ArrayProgram;

import java.util.ArrayList;
import java.util.Collections;

public class MinMax {
   public MinMax() {
      ArrayList<String> arraylist = new ArrayList();
      ArrayList<Integer> number = new ArrayList();
      arraylist.add("Pooja");
      arraylist.add("C");
      arraylist.add("Java");
      arraylist.add("Anu");
      arraylist.add("Dhanu");
      System.out.println("Print Original ArrayList: " + String.valueOf(arraylist));
      Collections.sort(arraylist);
      System.out.println("Print Sorted ArrayList: " + String.valueOf(arraylist));
      number.add(10);
      number.add(2);
      number.add(8);
      number.add(15);
      number.add(3);
      System.out.println("Print Original ArrayList: " + String.valueOf(number));
      Collections.sort(number);
      System.out.println("Print Sorted ArrayList: " + String.valueOf(number));
      System.out.println("Print minimum value: " + String.valueOf(number.get(0)));
      System.out.println("Print max value: " + String.valueOf(number.get(4)));
   }

   public static void main(String[] args) {
      ArrayList<Integer> number1 = new ArrayList();
      number1.add(10);
      number1.add(2);
      number1.add(18);
      number1.add(20);
      number1.add(3);
      System.out.println("Print Original ArrayList: " + String.valueOf(number1));
      int max = Integer.MIN_VALUE;

      int min;
      for(min = 0; min < number1.size(); ++min) {
         if ((Integer)number1.get(min) > max) {
            max = (Integer)number1.get(min);
         }
      }

      System.out.println("Print max value:" + max);
      min = Integer.MAX_VALUE;

      for(int i = 0; i < number1.size(); ++i) {
         if ((Integer)number1.get(i) < min) {
            min = (Integer)number1.get(i);
         }
      }

      System.out.println("Print min value:" + min);
   }
}
