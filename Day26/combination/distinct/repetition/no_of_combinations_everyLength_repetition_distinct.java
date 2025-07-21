// for calculating for r elements out of n formula is (n+r-1)Cr
// for all elements-> sum of this formula for r=1 to r=n 

public class no_of_combinations_everyLength_repetition_distinct {
    public static int factorial(int n){
        if((n==0)||(n==1)) return 1; 

        int fac = n * factorial(n-1); 
        return fac; 
    }

    public static int terms(int len, int index, int count){

        // index initially would be equal to 1
        if(index>len){
            return count; 
        }

        int a = factorial(len+index-1);
        int b = factorial(index);
        int c = factorial(len-1); 
        count = count + (a)/(b*c); 
        
        return terms(len, index+1, count); 
    }


    public static void main(String[] args) {

        String s = "abc"; 
        System.out.println("TTotal no of combinations of every length with repetitions are: ");

        int len = s.length();
        int total = terms(len,1,0);
        System.out.println(total);
        
    }

    
}
