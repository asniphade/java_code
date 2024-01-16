package loopsprogram;

import java.util.LinkedHashMap;

public class CharacterOccurance {
   public static void main(String[] args) {
      LinkedHashMap<Character, Integer> map = new LinkedHashMap();
      String name = "frontdoor";

      for(int i = 0; i < name.length(); ++i) {
         Character ch = name.charAt(i);
         if (map.containsKey(ch)) {
            map.put(ch, (Integer)map.get(ch) + 1);
         } else {
            map.put(ch, 1);
         }
      }

      System.out.println(map);
   }
}
