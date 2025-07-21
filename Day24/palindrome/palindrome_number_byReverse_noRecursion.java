
// we are checking the method inside while loop that will be converted into recursion code  
// other way is to convert number to a string and check by two pointers 

public class palindrome_number_byReverse_noRecursion {

    public static boolean palindrome(int num1, int num2){

        int help; 
        int x = num1; // as we need it later to check valid palindrome 

        //reversing the number
        while(num1>0){
            help = num1%10; 
            num1 = num1/10; 
            num2 = num2*10 + help; //num2 -> initially 0
        }


        return (x == num2); // if it is a palindrome, true is returned or else false is returned    

    }
    public static void main(String[] args) {
        
        boolean answer = palindrome(121,0); 
        System.out.println("Checking if number is palindrome or not: ");
        System.out.println(answer);
    }
}
