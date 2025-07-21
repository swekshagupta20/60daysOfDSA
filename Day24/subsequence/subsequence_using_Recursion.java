// here we have two choices-> include and exclude 
public class subsequence_using_Recursion {
    public static void main(String[] args) {
        String str = "abc";
        findSubsequences(str, 0, "");
    }

    public static void findSubsequences(String str, int index, String current) {
        if (index == str.length()) {
            System.out.print (current + " "); //total 8 elements printed for "abc" including empty string
            
            return;
        }

        // include
        findSubsequences(str, index + 1, current + str.charAt(index));

        // exclude
        findSubsequences(str, index + 1, current);
    }
}
