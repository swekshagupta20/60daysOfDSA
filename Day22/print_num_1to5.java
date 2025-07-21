public class print_num_1to5 {
    public static void printNum(int n){
        if(n==6) return;  //base case 
        System.out.println(n); //print statement 
        printNum(n+1); //recursion 
    }
    public static void main(String[] args) {
        System.out.println("Printing numbers from 1 to 5 using recursion ");

        printNum(1);
    }
}
