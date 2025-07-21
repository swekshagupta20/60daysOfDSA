// we can do this with number as well instead of string builder

public class decimal_to_binary_Recursion {
    public static void binary(int n, StringBuilder conv){

        if(n==0){
            System.out.println(conv.reverse().toString());
            return; 
        }

        int digit = n%2; 
        conv.append(digit); 
        n=n/2;

        binary(n,conv); //recursive function 
    }

    public static void main(String[] args) {
        int n = 17; 
        StringBuilder x = new StringBuilder(); 
        System.out.println("Converting decimal number "+ n+ " to binary: ");

        binary(n,x);  //empty string builder 
    }


}
