// We have to print number of all possible combinations of length r, if length of our string is n
// r<n

public class no_of_combinations_length_r_noRepetition_distinct {

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
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r); 

        //nCr = n! / (r!*(n-r)!)
        int ans = a/(b*c);
        System.out.println(ans);
        
    }
}
