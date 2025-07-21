//here we assume our string is sorted and we make a new array and copy only one occurance of each element of original string in it
public class removeDuplicates_String_sorted_newString {

    public static void removeDuplicates(String str, int idx, String newStr){

        //base case 
        if(idx==str.length()){
            newStr = newStr + str.charAt(idx-1);
            System.out.println(newStr);
            return; 
        }

        //initial index will be 1 
        if(str.charAt(idx)!=str.charAt(idx-1)){
            newStr = newStr + str.charAt(idx-1); //if two consecutive are not equal we add the left ele to the new String 

            removeDuplicates(str, idx+1, newStr); //checking from index+1 
        }
        else{
            removeDuplicates(str, idx+1, newStr);
        }

    }
    
    public static void main(String[] args) {
        String str = "aaabbccccdde";
        String strNew = ""; 

        System.out.println("Printing original string without duplicates: ");
        removeDuplicates(str, 1, strNew);

        
    }
    
}
