package ArrayProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class DuplicateElements {
   public static void main(String[] args) {
      ArrayList<Integer> arrayList = new ArrayList();
      arrayList.add(10);
      arrayList.add(20);
      arrayList.add(30);
      arrayList.add(40);
      arrayList.add(50);
      arrayList.add(40);
      arrayList.add(45);
      arrayList.add(30);
      arrayList.add(50);
      HashMap<Integer, Integer> map = new HashMap();
      ArrayList<Integer> uniq = new ArrayList();

      int a;
      for(a = 0; a < arrayList.size(); ++a) {
         int s = (Integer)arrayList.get(a);
         if (map.containsKey(s)) {
            map.put(s, (Integer)map.get(s) + 1);
         } else {
            map.put(s, 1);
         }
      }

      Iterator var6 = map.keySet().iterator();

      while(var6.hasNext()) {
         a = (Integer)var6.next();
         if ((Integer)map.get(a) > 1) {
            System.out.println("Print Duplicate Value: " + a + " = " + String.valueOf(map.get(a)));
         }
      }

      System.out.println(map);
      var6 = map.keySet().iterator();

      while(var6.hasNext()) {
         a = (Integer)var6.next();
         uniq.add(a);
      }

      System.out.println("Print first arraylist: " + String.valueOf(arrayList));
      System.out.println("Print uniq keys: " + String.valueOf(uniq));
   }
}
