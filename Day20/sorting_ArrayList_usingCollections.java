import java.util.ArrayList;
import java.util.Collections;

public class sorting_ArrayList_usingCollections {
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

        Collections.sort(list);
        System.out.println("sorted list in ascending order: "+ list);

        Collections.sort(list, Collections.reverseOrder()); //using comparator
        System.out.println("sorted list in descending order: "+ list);
        

    }
}
