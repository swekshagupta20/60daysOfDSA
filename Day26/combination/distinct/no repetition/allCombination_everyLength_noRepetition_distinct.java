public class allCombination_everyLength_noRepetition_distinct{
    public static void comb(String s, int idx, String str){

        if(idx == s.length()){
            System.out.println(str);
            return; 
        }

        // including character 
        comb(s, idx+1, str+s.charAt(idx));
        // exclude character
        comb(s, idx+1, str);
    }


    public static void main(String[] args) {
        String s = "abc";
        System.out.println("Printing all combinations of every length: ");
        comb(s, 0, "");
    }
}