public class no_of_combinations_length_r_repetition_distinct {
    public static int factorial(int n){
        if((n==0)||(n==1)) return 1; 

        int fac = n * factorial(n-1); 
        return fac; 
    }
    public static void main(String[] args) {

        String s = "abc"; 
        int r = 2; 
        System.out.println("No of combinations are: ");

        int n = s.length();
        int a = factorial(n+r-1);
        int b = factorial(r);
        int c = factorial(n-1); 
         
        // (n+r-1)Cr ->formula 
        // for this case -> aa,bb,cc,ac,bc,ab
        int ans = a/(b*c);
        System.out.println(ans);
        
    }
    
}