// permutation of n elements of string of length n -> n! terms 

public class permutation_n_from_n_distinct{

    public static void permutation(String s,int p, String str){

        if(p==s.length()){
            System.out.println(str);
            return; 
        }

        // we check for every character if it is present in the str or not 
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (!str.contains(Character.toString(x))) {
                permutation(s, p + 1, str + x);
            }
        }

    }   


    public static void main(String[] args) {

        String s ="abc"; 
        //char[] arr = s.toCharArray();

        permutation(s,0,"");

        
    }
}