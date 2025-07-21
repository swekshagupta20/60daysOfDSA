
public class print_num_5to1{

    public static void printNum(int n){
        if(n==0) return;  //base case 
        System.out.println(n); //print statement 
        printNum(n-1); //recursion 
    }
    public static void main(String[] args) {
        System.out.println("Printing numbers from 5 to 1 using recursion ");

        printNum(5);
    }
}