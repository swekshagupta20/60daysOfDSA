// we use boolean array to keep a track of element if it is present in the string or not 
// default of which is [F,F,F...]

public class permutations_of_string_distinct_noRepetition_booleanArray_backtracking{

    public static void permutation(String s, boolean[] used, int n, StringBuilder sb){

        if(sb.length()==n){
            System.out.println(sb.toString());
            return; 
        }

        for(int i=0; i<s.length(); i++){
            if(!used[i]){ // if element is not present we mark it present 
                used[i]=true; 
                sb.append(s.charAt(i)); // adding char to string builder 

                permutation(s, used, n, sb); // calling function recursively
                sb.deleteCharAt(sb.length()-1); // deleting it to save space 
                used[i] =false; // after deleting it is not present in the sb, hence marking it false 
            }
            
        }

    }

    public static void main(String[] args) {
        String s = "abc"; 
        boolean[] used = new boolean[s.length()];
        StringBuilder sb = new StringBuilder();
        permutation(s, used, s.length(), sb);
        
    }
}