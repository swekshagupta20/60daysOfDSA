public class all_permutations_of_length_r_stringN_distinct_nonRepetitive {

    public static void permutation(String s, String str, int r){

        // base case 1
        if(str.length()==r){
            System.out.println(str);
            return; 
        }

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!(str.contains(Character.toString(ch)))){     // if str does not contain character 
                // we add element to the list 
                permutation(s,str+ch,r); 
            }
        }

    }
    public static void main(String[] args) {

        String s = "abc"; 
        int r = 2; 
        permutation(s,"",r);
        
    }
    
}
