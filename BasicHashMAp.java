package loopsprogram;

import java.util.LinkedHashMap;

public class BasicHashMAp {
   public static void main(String[] args) {
      LinkedHashMap<String, Integer> map = new LinkedHashMap();
      map.put("Dhanu", 4);
      map.put("Anu", 24);
      map.put("Rockey", 1);
      map.put("Tom", 3);
      System.out.println(map);
      System.out.println(map.get("Dhanu"));
      if (map.containsKey("anu")) {
      }

      System.out.println("She is here");
      map.remove("Rockey");
      System.out.println(map);
      System.out.println(map.size());
      int s = map.size();
      System.out.println(s);
   }
}
