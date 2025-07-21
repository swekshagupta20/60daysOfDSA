public class first_and_last_occurence_string{

    public static void occurance(String s, int first, int last, int idx, char x){


        if(idx== s.length()){
            System.out.println("first occurance of character is: "+ first);
            System.out.println("Last occurance of character is: "+ last);
            return; 
        }
        if(s.charAt(idx) == x){
            if(first==-1){
                first = idx; 
            }
            else{
                last = idx; 
            }
        }
        occurance(s, first, last, idx+1, x);

    }
    public static void main(String[] args) {
        
        String str ="abcabcdddacdad";
        int first = -1;
        int last = -1; 
        int idx = 0; 
        char c ='a'; 
        occurance(str, first, last , idx, c);


    }
}