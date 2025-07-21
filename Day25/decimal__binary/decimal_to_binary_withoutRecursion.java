public class decimal_to_binary_withoutRecursion{
    public static void main(String[] args) {
        
        int n = 17; 
        StringBuilder sb = new StringBuilder(); 

        if(n==0){
            sb.append(0); 
        }

        while(n>0){
            int digit = n%2; 
            sb.append(digit); //from LSB to MSB
            n=n/2; 
        }

        System.out.println("Binary: "+ sb.reverse().toString());

       
    }

}