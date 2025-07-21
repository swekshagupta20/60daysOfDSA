public class allCombinations_length_r_repetition_distinct {

    public static void combination(String s, int idx, String str){

        int r = 2; 
        if(str.length()==r){         //we just change the base condition of this case and limit the output to length r 
            System.out.println(str);
            return; 
        }

        for(int i = idx; i<s.length(); i++){
            char ch = s.charAt(i);
            combination(s, i, str+ch);
        }
    }

    public static void main(String[] args) {
        String s = "abc"; 
        combination(s, 0,"" );
    } 
}
