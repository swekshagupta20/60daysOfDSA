import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors; 

 
public class basics{
    public static void main(String[] args) {
        
        //initialisation of array list 
        //ArrayList <datatype in obj form>  name= new ArrayList<>(); 
        
        ArrayList <Integer> list = new ArrayList<>(); //length is variable
        
        //adding elements 
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        //get element at a specific index 
        System.out.println("Element at index 1 is: ");
        System.out.println(list.get(1));

        //getting length of list 
        int len = list.size();
        System.out.println("Length of the list is: "+len);

        //printing list with loop
        System.out.println("printing list using loop: ");
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }


        //printing list directly 
        System.out.println("Printing list directly: ");
        System.out.println(list);

        //adding element at some index 
        System.out.println("Adding element at given index: ");
        list.add(1,100); //(index, element)
        System.out.println(list);

        //modifying element at index i 
        System.out.println("Modifying element at given index: ");
        list.set(3,300); //(index, element)
        System.out.println(list);

        //removing an element from a specific index 
        System.out.println("Removing element from specific index: ");
        list.remove(3); 
        System.out.println(list);
        
        //removing an element from first occurance
        int[] arr2 = {10,10,10,20,30,30,20,40};
        //ArrayList<Integer> list2 = new ArrayList<>(Arrays.stream(arr2).boxed().collect(Collectors.toList()));
        //java version less than 16, do not support Collectors.toList() for array list
        //hence we have to collect to List<> then wrap to ArrayList

        List<Integer> tempList = Arrays.stream(arr2).boxed().collect(Collectors.toList()); //this is fixed sized 
        ArrayList<Integer> list2 = new ArrayList<>(tempList); //this is variable sized

        System.out.println("Before removing element's first occurence: ");
        System.out.println(list2);

        list2.remove(Integer.valueOf(10)); //removing ele
        //boxing was needed as the remove function needed to understand what to remove, object at index or a specific element 

        System.out.println("After removing first occurance of an element: ");
        System.out.println(list2);

        //removing all occurences of 10 
        System.out.println("removing all occurences of an element: ");
        list2.removeIf(n -> n == 10);
        System.out.println(list2);

        //checking presence of an element 
        boolean ans = list2.contains(10); //boxing not needed as done automatically here 
        System.out.println("Does list 2 contain 10?: "+ ans);


    }
}