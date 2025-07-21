public class palindrome_number_byReverse_recursion {
    public static int reverse(int num1, int num2, int help){

        if(num1 == 0){
            return num2; 
        }

        // help is the digit we get in remainder
        help = num1%10; 
        num1 = num1/10; 
        num2 = num2*10 + help; 

        return reverse(num1, num2, help);
    }

    public static void main(String[] args) {
        
        int x = 121; // need for cheking palindrome 

        int answer = reverse(121,0,0); 
        System.out.println("Checking if number is palindrome or not: ");

        if(x == answer){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
    }
}