// our goal is to calculate x^n using recursion when our stack height is n 

import java.util.Scanner;

public class power_stackHeight_n {

    public static int calPower(int x, int n){

        if(n==0) return 1;
        if(x==0) return 0; 
        int power = x * calPower(x,n-1); 
        return power; 
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of base: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of power: ");
        int n = sc.nextInt();

        System.out.println("Printing x to the power n: ");
        int ans = calPower(x, n);
        System.out.println(ans);
    }
}
