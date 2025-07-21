public class all_binary_string_length_n{

    public static void binary(String str, int n){

        if(str.length()==n){
            System.out.println(str);
            return; 
        }

        // next char is 0
        binary(str+'0', n);
        // next char is 1
        binary(str+'1', n); 
    }


    public static void main(String[] args) {


        System.out.println("Printing all binary strings of given length: ");
        int n=3; 
        binary("", n);
        
    }
}