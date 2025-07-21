import java.util.Scanner;

public class power_stackHeight_logN {
   public static int calPower(int x, int n){

        if(n==0) return 1;
        if(x==0) return 0; 
        
        if(n%2==0){
            return calPower(x,n/2) * calPower(x,n/2);
        }
        else{
            return calPower(x,n/2) * calPower(x,n/2) * x;
        }
        
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
