public class allCombinations_lengthN_repetition_distinct{

    public static void combination(String s, int idx, String str){
        if(str.length()==s.length()){
            System.out.println(str +" "+ idx); // idx is to track recursion while making a call stack 
            return; 
        }

        for(int i=idx; i<s.length(); i++){ // we take i=idx so as to ensure anagrams are not present in the output
            // it basically prevents the occurance of a smaller character after bigger one 
            char ch = s.charAt(i); 
            combination(s,i,str+ch);
        }
    }
    public static void main(String[] args) {
        String s = "abc"; 
        combination(s, 0,"" );
    }  
}