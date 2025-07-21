public class sum_of_first_n {
    public static void printSum(int i, int n, int sum){
        if(i==n){
            sum = sum + i; 
            System.out.println(sum);
            return; 
        }
        sum = sum +i; 
        printSum(i+1,n,sum);
    }
    public static void main(String[] args) {
        System.out.println("Sum of first n using recursion ");

        printSum(1,5,0);
    
    }
}
