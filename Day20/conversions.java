import java.util.ArrayList; 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors; 


public class conversions {
    public static void main(String[] args) {

        //List creation 
        //List<datatype> name = new List<>(); ->variable length 
         
        // 1. creating empty object list 
        List<String> list = new ArrayList<>();

        // 2. creating list with elements 
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5)); // can be modified 

        // 3. creating list again 
        List<Integer> list3 = Arrays.asList(1,2,3,4,5); // cannot be modified as fixed length 

        // 2 and 3 can be written as 
        Integer[] arr = {2,3,5,6,7,7}; // for object datatype 
        List<Integer> list4 = Arrays.asList(arr); //fixed size 

        //for primitive array 
        int[] arr2 = {3,4,5,6,6,6,5};
        List<Integer> list5 = Arrays.stream(arr2).boxed().collect(Collectors.toList()); //fixed size 
        
        //for primitive but variable size 
        int[] arr3 = {5,6,5,4,3,6,4,7};
        List<Integer> list6 = new ArrayList<>(Arrays.stream(arr3).boxed().collect(Collectors.toList()));

        //for ArrayList we can write ArrayList instead of list for the same operations except 
        //ArrayList<Integer> list2 = new ArrayList<>(Arrays.stream(arr2).boxed().collect(Collectors.toList()));
        //java version less than 16, do not support Collectors.toList() for array list
        //hence we have to collect to List<> then wrap to ArrayList
        
        List<Integer> tempList = Arrays.stream(arr3).boxed().collect(Collectors.toList());
        ArrayList<Integer> list7 = new ArrayList<>(tempList); 

        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
        System.out.println(list5);
        System.out.println(list6);
        System.out.println(list7);

    }
}
