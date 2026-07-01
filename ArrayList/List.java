import java.util.*;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N5umber of Array list :");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            list.add(i);
        }
        System.out.println(list);
    }
}
