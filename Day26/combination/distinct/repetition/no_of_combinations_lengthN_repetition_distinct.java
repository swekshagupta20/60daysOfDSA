public class no_of_combinations_lengthN_repetition_distinct {
    public static int factorial(int n){
        if((n==0)||(n==1)) return 1; 

        int fac = n * factorial(n-1); 
        return fac; 
    }
    public static void main(String[] args) {

        String s = "abc"; 
        System.out.println("No of combinations are: ");

        int n = s.length();
        int a = factorial(2*n-1);
        int b = factorial(n);
        int c = factorial(n-1); 
         
        // (n+r-1)Cr -> here r=n; formula 
        // (2n-1)Cn -> for this case if repetition is allowed 
        // 
        int ans = a/(b*c);
        System.out.println(ans);
        
    }
    
}
