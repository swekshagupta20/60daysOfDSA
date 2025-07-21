// here we do not use string builder instead directly convert it into binary form 

public class decimal_to_binary_withoutRecursion_direct {
    
    public static void main(String[] args) {
        int n = 17; 
        int place = 1; //to keep a count of digits place 
        int binary = 0; // place where final converted number is stored 

        while(n>0){
            int digit = n%2; 
            binary  = binary + digit*place; 
            place = place*10; 
            n=n/2;
        }

        System.out.println("Converted number is: "+ binary);
    }
}
