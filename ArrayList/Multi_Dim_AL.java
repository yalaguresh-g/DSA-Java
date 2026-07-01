import java.util.*;

public class Multi_Dim_AL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(12);
        list2.add(13);
        mainList.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.add(21);
        list3.add(22);
        list3.add(23);
        mainList.add(list3);

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(45);
        list4.add(96);
        list4.add(78);
        mainList.add(list4);

        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size() ; j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}
