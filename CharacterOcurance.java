package loopsprogram;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class CharacterOcurance {
   public static void main(String[] args) {
      LinkedHashMap<Character, Integer> map = new LinkedHashMap();
      String name = "FRONTDOOR";

      Character k;
      for(int i = 0; i < name.length(); ++i) {
         k = name.charAt(i);
         if (map.containsKey(k)) {
            map.put(k, (Integer)map.get(k) + 1);
         } else {
            map.put(k, 1);
         }
      }

      String ans = "";
      Iterator var5 = map.keySet().iterator();

      while(true) {
         do {
            if (!var5.hasNext()) {
               System.out.println("before removed: " + name);
               System.out.println("After removed: " + ans);
               return;
            }

            k = (Character)var5.next();
         } while((Integer)map.get(k) == 3);

         for(int i = 0; i < (Integer)map.get(k); ++i) {
            ans = ans + String.valueOf(k);
         }
      }
   }
}
