import java.util.ArrayList;
public class Basic {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(64);
        list.add(105);
        list.add(36);
        list.add(89);
        list.add(45);

        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<list.size(); i++){
            // if (max < list.get(i)) {
            //     max = list.get(i);
            // }

            max= Math.max(max, list.get(i));
        }
        System.out.println("max element is " + max);
        // print max NUmber -->



        // System.out.println(list);
        // System.out.println(list.size());

        // reverse Number -->
        // for(int i=list.size()-1 ;i>=0 ; i--){
        //     System.out.print(list.get(i) +" ");
        // }
        // System.out.println();
        // int el = list.get(1);
        // System.out.println(el);

        // list.remove(0);
        // System.out.println(list);

        // list.set(1, 12);
        // System.out.println(list);

        // System.out.println(list.contains(50));
        // System.out.println(list.contains(11));
    }
}

