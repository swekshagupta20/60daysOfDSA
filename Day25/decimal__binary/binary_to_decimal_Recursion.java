public class binary_to_decimal_Recursion {

    public static void convert(int n, int pow_2, int sum){

        if(n==0){
            System.out.println("Converted value is: " +sum);
            return;
        }

        int digit = n%10; 
        sum = sum + digit*(int)Math.pow(2,pow_2);
        convert(n/10, pow_2+1, sum);

    }
    public static void main(String[] args) {
        int n = 10001; 
        //check if it is in binary or not -> for this we will see if all of its digits are either 0 or 1

        convert(n,0,0);
        
    }
}