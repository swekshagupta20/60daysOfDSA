import java.util.ArrayList;
import java.util.Collections;

public class reverse_ArrayList_usingCollections {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(56);
        list.add(33);
        list.add(22);
        list.add(1);
        list.add(44);
        list.add(35);

        System.out.println("Original list: " +list);
        Collections.reverse(list);
        System.out.println("reversed list: "+ list);
    }
}
