import java.util.*;
public class PrintArr {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 250);
        map.put("China", 100);
        map.put("America", 30);
        System.out.println(map);

        // int arr[] ={10,20,30,40,50,60,70,80,90,100};
        // for(int val: arr){
        //     System.out.print(val + " ");
        // }
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
