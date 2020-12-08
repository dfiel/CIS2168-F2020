import java.util.HashMap;
import java.util.Map;

public class Reducer {

   public HashMap<String, Integer> reduce(HashMap<String, Integer> map1, HashMap<String, Integer> map2) {
      HashMap<String, Integer> retMap = new HashMap<>(map1);

      for (String key : map2.keySet()){
         retMap.put(key, retMap.getOrDefault(key, 0)+map2.get(key));
      }

      return retMap; // <- change this line to return the hash map
   }

   public static void main(String[] args) {

      Mapper mapper1 = new Mapper("tiny1.txt");
      HashMap<String, Integer> map1 = mapper1.getWordcount();
      System.out.println(map1);

      Mapper mapper2 = new Mapper("tiny2.txt");
      HashMap<String, Integer> map2 = mapper2.getWordcount();
      System.out.println(map2);

      HashMap<String, Integer> map = new Reducer().reduce(map1, map2);
      System.out.println(map);
      System.out.println(new Mapper("tinyTale.txt").getWordcount());
   }
}
