//making a frequency array for the same
//logic here is that size of array would be 26- 0 to 25 for alphabets a to z
//index assigned in form of 0-> 'a'-'a', 1->'b'-'a' (ascii value of 'b'-'a'=1)

public class removeDuplicates_String_unsorted_newString {

    public static boolean[] freq = new boolean[26]; 

    public static void removeDuplicates(String str, int idx, String newString){
        
        if(idx == str.length()){
            System.out.println(newString);
            return; 
        }
        char x = str.charAt(idx);
        if(freq[x-'a'] == true){
            removeDuplicates(str, idx+1, newString); 
        }
        else{
            newString = newString + x;
            freq[x-'a'] = true; 
            removeDuplicates(str, idx+1, newString);
        }

    }
    public static void main(String[] args) {
        String str ="abccdbbeeabc";
        System.out.println("Printing string without duplicates using freq array: ");

        removeDuplicates(str, 0, "");     

    }
}
