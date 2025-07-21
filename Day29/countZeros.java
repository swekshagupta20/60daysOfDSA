
public class countZeros {

    public static int count(int n){
        if (n==0) return 0; 
        int digit = n%10; 
        return (digit ==0? 1:0) + count(n/10); 
    }

    public static void main(String[] args) {
        
        System.out.println("Counting number of zeros: ");
        System.out.println(count(102030));
    }
    
}
