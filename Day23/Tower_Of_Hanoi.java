
// tower of hanoi where there are two rules -> only one disk trasferred in one step  
//always smaller disk on top of larger one 
public class Tower_Of_Hanoi{

    public static void towerOfHanoi(int n, String src, String helper, String des){

        if(n==1){
            System.out.println("Transfer disk: "+ n + " from " + src + " to " + des);
            return; 
        }

        //transferring n-1 disks from src to helper disk 
        towerOfHanoi(n-1, src, des, helper);

        //trasferring nth disk from src to des 
        System.out.println("Transfer disk: "+ n + " from " + src + " to " + des);

        //transferring n-1 disks from helper to des
        towerOfHanoi(n-1,helper, src, des);
        
    }
    public static void main(String[] args) {
        System.out.println("Tower of hanoi: ");
        String src = "S"; 
        String helper = "H"; 
        String des = "D"; 
        towerOfHanoi(3, src, helper, des);
    }
}