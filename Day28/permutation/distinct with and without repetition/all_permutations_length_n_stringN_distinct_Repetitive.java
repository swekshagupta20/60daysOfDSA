public class all_permutations_length_n_stringN_distinct_Repetitive {
    public static void permutation(String s, String str){

        // base case 1
        if(str.length()==s.length()){
            System.out.println(str);
            return; 
        }

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);   
            permutation(s,str+ch); 
    
        }

    }
    public static void main(String[] args) {

        System.out.println("Printing all permutations of length n of string of length N where elements are distinct and repetition takes place:  ");

        String s = "abc"; 
        permutation(s,"");
        
    }

}
