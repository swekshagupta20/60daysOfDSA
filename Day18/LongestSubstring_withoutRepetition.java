public class LongestSubstring_withoutRepetition {

    public static void main(String[] args) {
    String s = "abcbcdefa";
    int len = s.length();
    int i=0; //first pointer 
    int j=1; //second pointer 
    int max_len=0;  //max length of substring stored here
 
    while(j<len){
        String sub = s.substring(i,j);
        char x = s.charAt(j);

        if(sub.contains(String.valueOf(x))) {
            i++; //shrinking window from left 
        }
        else{ 
            j++; //expanding window from right 
        }

        //updating value of max length 
        max_len = Math.max(max_len , j-i); //j-i is the length of the current window
    }
    System.out.println("Max length of the substring is: "+ max_len);
    //complexity is O(n^2)   
    }
}
