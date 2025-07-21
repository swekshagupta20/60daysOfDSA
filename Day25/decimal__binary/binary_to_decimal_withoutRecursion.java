public class binary_to_decimal_withoutRecursion {
    public static void main(String[] args) {
        int n = 10001; 
        //check if it is in binary or not -> for this we will see if all of its digits are either 0 or 1

        int pow_2 = 0; //will increment with digits 
        int digit; 
        int sum = 0; 

        while(n>0){
            digit = n%10; 
            sum = sum + digit*(int)Math.pow(2,pow_2);
            pow_2++;
            n=n/10;  
        }
        System.out.println("Converted value is: "+sum);
    }
}
