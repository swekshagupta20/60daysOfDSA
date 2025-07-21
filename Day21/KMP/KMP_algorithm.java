// pattern search in string using KMP algo 
// difference from normal searching is that the pointer doesnt backtrack in the original string, it only backtracks in pattern 
// hence avoids redundant checks 
// small fallback 
public class KMP_algorithm{

    public static int[] LPS_array(String pattern){
        int i=0;
        int j=i+1;
        int[] arr = new int[pattern.length()];

        arr[i]=0; 

        while(j<pattern.length()){
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

    public static void KMP(String P, String pattern){

        // making LPS array for the pattern
        int[] LPS = LPS_array(pattern);

        //comparing and finding the index of pattern 
        int i=0; 
        int j=0; 


        while(i<P.length()){
            if(P.charAt(i)==pattern.charAt(j)){
                i++; 
                j++; 
            }

            if(j==pattern.length()){
                System.out.println("Pattern found at index: "+ (i-j));
                j = LPS[j-1]; // continue searching 
            }
            else if(i<P.length() && pattern.charAt(j)!=P.charAt(i)){
                if(j==0){
                    i++;
                }
                else{
                    j = LPS[j-1];

                }
                
            }

        }

    }

    
        

    public static void main(String[] args) {

        String P1 = "ababcabcabababd";
        String pattern = "ababd"; 
        
        KMP(P1,pattern);
        
        
    }
}