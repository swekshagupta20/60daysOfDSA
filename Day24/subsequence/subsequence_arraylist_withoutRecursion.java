//three ways to find subsequence of a string- using array list, using recursion and using bit masking 
//this is simple method using array list 
import java.util.*;
public class subsequence_arraylist_withoutRecursion {

    public static void main(String[] args) {
        
        String str = "abc";
        
        //initialising an empty array list to keep elements 
        List<String> list = new ArrayList<>();

        //adding empty element to the list 
        list.add("");

        for(int i=0; i<str.length(); i++){
            char x = str.charAt(i);
            int currentSize = list.size(); // if we use it directly in next loop, it will continue as in infinite loop
            //this is because it will continue to add element to even the elements that has already been modified in the current iteration 

            for(int j=0; j<currentSize; j++){

                String var = list.get(j) + x; 
                list.add(var); 
            }
        }

        //printing all subsequences 
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    
}