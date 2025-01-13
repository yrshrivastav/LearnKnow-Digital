import java.util.HashMap;
import java.util.Map;

public class AnrQ2 {
    public static void main(String[] args) {
        Map Quantities = new HashMap<String, Integer>();
        Quantities.put("Apple", 10);
        Quantities.put("Banana", 5);
        Quantities.put("Orange", 7);

        Map Price = new HashMap<String, Integer>();
        Price.put("Apple", 2);
        Price.put("Banana", 3);
        Price.put("Orange", 1);

        Map TotalCost = new HashMap<String, Integer>();
        TotalCost = AnrQ2.totalCost(Quantities, Price);
        for (Object key : TotalCost.keySet()){
            System.out.println(key + " " + TotalCost.get(key));
        }
    }
    public static Map<String, Integer> totalCost(Map<String, Integer> m1, Map<String, Integer> m2){
        Map map = new HashMap<String, Integer>();
        for (Object key : m1.keySet()) {
            int price = m1.get(key)*m2.get(key);
            map.put(key, price);
        }
        return map;
    }
}
