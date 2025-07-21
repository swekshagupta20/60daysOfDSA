
import java.util.Arrays;

public class LPS {

    public static int[] LPS_array(String pattern){
        int i=0;
        int j=i+1;
        int[] arr = new int[pattern.length()];

        arr[i]=0; 

        while(j<pattern.length()){
            //arr[j]=0;
            if(pattern.charAt(i)==pattern.charAt(j)){
                arr[j]=1;
                int n=1;
                while(pattern.charAt(i+n)==pattern.charAt(j+n)){
                    arr[j+n] = arr[j+n-1]+1;
                    n++;
                }
                j=j+n; 
            }
            j++;
        }
        return arr;

    }
    public static void main(String[] args) {

 
        String pattern = "abcdabeabf";
        int[] ans = LPS_array(pattern);
        System.out.println(Arrays.toString(ans));
        
    }
    
}
