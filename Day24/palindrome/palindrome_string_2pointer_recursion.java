// one way is to reverse the string using String builder and then check equality but this is not recursion 
// we can use void and only keep the print string or we can use boolean return type and answer in true or false depending on our needs 
// I have tried both for practice 

public class palindrome_string_2pointer_recursion {

    public static boolean palindrome(String str, int p1, int p2){
        
        //base case
        if(p1>p2){
            System.out.println("String is a palindrome. ");
            return true; 
        }

        if(str.charAt(p1)==str.charAt(p2)){
            return palindrome (str, p1+1, p2-1);  //incrementing and decrementing pointers 
            // will return answer to nearest recursion in call stack 
        }
        else{
            System.out.println("String is not a palindrome. ");
            return false; //not a palindrome, exiting immediately 
        }


    }
    public static void main(String[] args) {
        String str = "abbcbba"; 
        String str2 = "abc";

        System.out.println("Is string " + str + " a palindrome? ");
        boolean ans  = palindrome(str, 0, str.length()-1); 
        System.out.println(ans);

        System.out.println();

        System.out.println("Is string " + str2 + " a palindrome? ");
        boolean ans2 = palindrome(str2, 0 , str2.length()-1); 
        System.out.println(ans2);

    }
}
