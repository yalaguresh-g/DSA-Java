import java.util.*;
public class MapBasic {

    public static void main(String[] args) {
        // country(key) , Population(value)
        HashMap<String, Integer> map = new HashMap<>();
        map.put("india", 122);
        map.put("China", 20);
        map.put("USA", 30);
        System.out.println(map);
        map.put("China", 200);
        // System.out.println(map);
        // if (map.containsKey("indo")) {
        //     System.out.println("key is present in map");
        // }
        // else{
        //     System.out.println("key is not present in map");
        // }
        System.out.println(map.get("USA"));
        System.out.println(map.get("America"));
    }
}
