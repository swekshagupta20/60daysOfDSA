public class factorial {
    public static int fac(int n){
        if (n==1 || n==0) return (1);  
        int factorial = n * fac(n-1);
        return factorial;
    }
    public static void main(String[] args) {
        System.out.println("Code to find factorial using recursion: ");
        int x = 6; 
        int factorial = fac(x);
        System.out.println(factorial);
        
    }
}

//first mention what you have to call recursively 
//then write the base case 