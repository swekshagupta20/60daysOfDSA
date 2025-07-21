public class all_permutations_every_length_stringN_distinct_nonRepetitive {

    public static void permutation(String s, String str){

        // base case 1
        if(str.length()>0){
            System.out.println(str);
        }
        // base case 2
        if(str.length()==s.length()){
            return; 
        }

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!(str.contains(Character.toString(ch)))){     // if str does not contain character 
                // we add element to the list 
                permutation(s,str+ch); 
            }
        }

    }
    public static void main(String[] args) {

        String s = "abc"; 
        permutation(s,"");
        
    }

    
}
