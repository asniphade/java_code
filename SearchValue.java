package ArrayProgram;

import java.util.ArrayList;

public class SearchValue {
   public static void main(String[] args) {
      ArrayList<Integer> arrayList = new ArrayList();
      arrayList.add(10);
      arrayList.add(20);
      arrayList.add(30);
      arrayList.add(40);
      arrayList.add(50);
      boolean flag = false;

      for(int i = 0; i < arrayList.size(); ++i) {
         if (((Integer)arrayList.get(i)).equals(20)) {
            System.out.println("Number is Found");
            flag = true;
            break;
         }
      }

      if (!flag) {
         System.out.println("Number is not Found");
      }

   }
}
