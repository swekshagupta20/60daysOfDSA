//here we print all binary strings of length n -> we either print 1 or 0. 
public class all_binary_len_n {

    public static void binary(int len, int idx, String str){

        // idx gives the current index of the string
        if(idx == len){
            System.out.println(str);  // str-> string 
            return; //return once idx reaches len 
        }
        
        //now either 1 appended 
        binary(len, idx+1, str+ '1');
        
        // or 0
        binary(len, idx+1, str + '0');
        
    }


    public static void main(String[] args) {
        int len = 3; 
        String s =""; 

        //MSB is always 1 otherwise len would not be matched 
        s = s +'1'; 
        binary(len,1,s);    
    }
    
}
