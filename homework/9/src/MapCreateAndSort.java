import java.util.*;


public class MapCreateAndSort {

    public static Map<String, Integer> createMap(List<String> list){
        Map<String, Integer> map = new HashMap<>();

        for (String word : list) {
            if(!map.containsKey(word)){
                map.put(word, 1);
            }else {
                map.put(word, map.get(word) + 1);
            }
        }
        return map;
    }

    public static Map<String, Integer> sortMap(Map<String, Integer> map){
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
            map.entrySet().stream()
                .limit(10)
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(e -> sortedMap.put(e.getKey(),e.getValue()));
        return sortedMap;
    }
}
