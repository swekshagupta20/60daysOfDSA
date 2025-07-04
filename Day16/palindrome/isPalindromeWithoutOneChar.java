import java.util.*;

public class isPalindromeWithoutOneChar{

    public static boolean isPalindrome(String str){ 
        char[] str1 = str.toCharArray(); //original array 
        char[] str2 = Arrays.copyOf(str1, str1.length); // array we have to reverse 

        //reversing the array str2
        int start=0;
        int end= str2.length-1;
        char temp; 

        while(start<end){
            temp = str2[start];
            str2[start] = str2[end];
            str2[end] = temp; 
            start++;
            end--;
        }

        //checking for normal palindrome
        if (Arrays.equals(str1, str2)){
            return true; 
        }


        //now using two pointers to find diff array 
        int k = 0;
        int len = 0;
        //char[] diff_1 = new char[str1.length]; //reversing this would means extra zeroes might ruin calculation
        //thus two choices- only reverse elements needed or make array of length which is actually required 


        //making array of length which is actually required 
        while(k<str1.length){
            if(str1[k]!=str2[k]){
            len++; //this would be length of the new array 
          }
          k++;
        }

        //if more than 2 mismatches, then we cant fix by removing one character 
        if(len>2) return false; 

        //initialising new arrays to form new array 
        char[] diff_1 = new char[len];
        char[] diff_2 = new char[len];
        

        //now we use for loop to input items
        int m=0;
        for(int i=0; i<str1.length; i++){
            if(str1[i]!=str2[i]){
                diff_1[m] = str1[i];
                diff_2[m] = str2[i];
                m++;
            }
        }

        //reversing diff_2 
        start=0;
        end= diff_2.length-1;
        temp= 0; 
        while(start<end){

            temp = diff_2[start];
            diff_2[start] = diff_2[end];
            diff_2[end] = temp; 
            start++;
            end--;
        }

        //checking if they are equal
        //return Arrays.equals(diff_1, diff_2); // with this error occurs if we do not have consecutive different elements 
        return Arrays.equals(diff_1, diff_2);
        
    }
    public static void main(String[] args) {

        //testing function 
        System.out.println(" "+ isPalindrome("abca"));
        System.out.println(" "+ isPalindrome("aabbaa"));
        System.out.println(" "+ isPalindrome("aabcd"));
        System.out.println(" "+ isPalindrome("racecar"));
    }
}