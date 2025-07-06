//if our original string is made by concatenation of atleast two substrings and we double it then it has atleast 4 substrings in it 
//if we remove first and last letter of our doubled string, we will be able to find our original string in it if it is RSP


public class RepeatedSubstringPattern_smartMethod {
    public static void main(String[] args) {
        String s = "abcabcabc";
        String str = s+s; 

        boolean ans = str.substring(1,str.length()-1).contains(s);
        System.out.println("The string is Repeated Substring or not?: "+ ans);
    }
}
