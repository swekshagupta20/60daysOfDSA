import java.util.Scanner; 

public class print_num_nto1 {
    public static void printnum(int n){
        if(n==0) return; 
        System.out.print(n + " ");
        printnum(n-1); 
    }
    public static void main(String[] args) {
        System.out.println("Printing numbers from n to 1 using recursion: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int x = sc.nextInt();
        printnum(x);

    }
}
