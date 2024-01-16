package ArrayProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstProgram {
   public static void main(String[] args) {
      ArrayList<Integer> arrayList = new ArrayList();
      System.out.println("Enter the size:");
      Scanner sc = new Scanner(System.in);
      int input = sc.nextInt();
      int sum = 0;

      for(int i = 0; i < input; ++i) {
         System.out.println("Enter the element:");
         int a = sc.nextInt();
         arrayList.add(a);
         sum += (Integer)arrayList.get(i);
      }

      System.out.println(arrayList);
      System.out.println(sum);
   }
}
