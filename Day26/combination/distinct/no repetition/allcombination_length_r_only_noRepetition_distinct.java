// we have to print all combinations of r length elements from string of length n
public class allcombination_length_r_only_noRepetition_distinct{

    public static void comb(String s, int p, int idx, String str){
        // s -> original string 
        // str-> string we modify and print 
        // k-> length of the combination strings 
        // idx-> index traversal pointer of original string  
        // p-> pointer will keep a track of len of str!==k 

        int k = 2; 
        if(p==k){
            System.out.println(str);
            return; 
        }
        if(idx ==s.length()){
            return; 
        }

    
        char ch = s.charAt(idx); 

        //keeping character ch in new string 
        comb(s, p+1, idx+1, str+ch);

        //not keeping character ch in new string 
        comb(s,p,idx+1, str); 

    }

    public static void main(String[] args) {
        String s = "abc";
        comb(s, 0, 0, "");
    }


}