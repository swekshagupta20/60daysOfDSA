// in this method, we use two pointers P0 and p1, and use string builder instead of string 

public class removeDuplicates_String_sorted_inplace {

    public static void removeDuplicates(StringBuilder str, int p1, int p2){

        //base case 
        if(p2==str.length()){
            str.setCharAt(p1, str.charAt(p2-1));
            System.out.println(str.toString().substring(0,p1+1)); //printing only p1+1 indexes 
            return; 
        }

        //initially p1=0 and p2=1
        if(str.charAt(p2)!=str.charAt(p2-1)){
            str.setCharAt(p1, str.charAt(p2-1)); 
            removeDuplicates(str, p1+1,p2+1);
        }
        else{
            removeDuplicates(str, p1, p2+1); 

        }


    }
    
    public static void main(String[] args) {
        String s = "aaabbccccdde";
        StringBuilder str = new StringBuilder(s); 
        int p1 = 0;
        int p2 = 1; 

        System.out.println("Printing original string without duplicates: ");
        removeDuplicates(str, p1, p2);

        
    }
    
}
