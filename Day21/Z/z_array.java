
import java.util.Arrays;


public class z_array{

    public static int[] z(String s){
        int[] arr = new int [s.length()]; // to keep z values 
        int len = s.length();

        int i=0;
        int j=i+1; 
        arr[0] = 0;

       while(j<len){

        int n = 1; // **
        if(s.charAt(i)==s.charAt(j)){ 
            while((j+n)<len && (s.charAt(n)==s.charAt(j+n))){
                n++;
            }
            arr[j] = n; 
        }  // 
        j++; 
       }
    
        return arr; 

    }
    public static void main(String[] args) {

        int[] x = z("abcdabcabc");
        System.out.println(Arrays.toString(x));
    }
}

/*
 * we can modify code lines between // ** // as: 
 * int n = 0;
 * while((j+n)<len && s.charAt(n)==s.charAt(j+n)){
 * n++; 
 * }
 * arr[j] = n
 */