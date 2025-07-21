public class permutations_of_string_distinct_Repetitive_backtracking {

    public static void permutation(String s, StringBuilder sb){

        if(sb.length()==s.length()){
            System.out.println(sb.toString());
            return; 
        }

        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
                sb.append(ch);
                permutation(s, sb);
                sb.deleteCharAt(sb.length()-1); // backtracking 
            
        }

    }

    public static void main(String[] args) {
        System.out.println("Print permutations of a string using presence of element or character:");
        String s = "abc"; 
        StringBuilder sb = new StringBuilder();
        permutation(s, sb);
        
    }
    
}
