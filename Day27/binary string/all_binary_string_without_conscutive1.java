

public class all_binary_string_without_conscutive1 {

    public static void binary(int n, String str){

        if(str.length()==n){
            System.out.println(str);
            return; 
        }

        // next char can be zero always
        binary(n, str+'0');

        if(str.length()==0 || str.charAt(str.length()-1)!='1'){
            // next char can be 1 if true 
            binary(n, str+'1');

        }    
    }


    public static void main(String[] args) {


        System.out.println("Printing all binary strings of given length: ");
        int n=3; 
        binary(n, "");
        
    }
    
}
