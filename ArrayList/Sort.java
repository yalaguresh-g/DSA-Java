import java.util.*;
public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(56);
        list.add(95);
        list.add(12);
        list.add(16);
        System.out.println(list);

        Collections.sort(list); // ascending 
        System.out.println(list);

        // descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
