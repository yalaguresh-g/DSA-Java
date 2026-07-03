import java.util.HashSet;
import java.util.Iterator;
public class HashBasic {
    public static void main(String[] args) {
        
    HashSet<Integer> set=new HashSet<>();
    set.add(45);
    set.add(2);
    set.add(65);
    set.add(4);
    set.add(8);
    set.add(10);
   
    System.out.println(set);
    System.out.println(set.size());
    if(set.contains(1)){
        System.out.println("Present");
    }
    else{
        System.out.println("Not Present");
    }
    set.remove(2);
    System.out.println(set);
    if(set.contains(2)){
        System.out.println("Present");
    }
    else{
        System.out.println("Not Present");
    }

    Iterator<Integer> itr=set.iterator();
    System.out.println("Elements are:");
    while(itr.hasNext()){
        
        System.out.print(" "+itr.next());

    }
    }
}