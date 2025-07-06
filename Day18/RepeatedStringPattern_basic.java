// can a string be created by taking a substring of it and appending it multiple times 

public class RepeatedStringPattern_basic{

    public static boolean RSP(String s){
        int len = s.length();
        for(int i=1; i<=len/2; i++){ //len/2 because a string can be repeated a minimum of two times 
            if(len%i==0){ //only those substrings are checked which can be repeated whole number of times 
                String sub = s.substring(0,i);
                StringBuilder rep = new StringBuilder();

                for(int j=0; j<len/i; j++){ //len/i means quotient i.e number of times i is repeated to form len
                    rep.append(sub);
                }
                if(rep.toString().equals(s)) return true; 
            }
        }
        return false; 
    }
    public static void main(String[] args) {
        String s = "ababab";

        boolean ans = RSP(s);
        System.out.println("Is the string repeated substring pattern?"+ ans);



    }
}