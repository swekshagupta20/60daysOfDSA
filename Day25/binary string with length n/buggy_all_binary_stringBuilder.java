// this code is only for reference purposes means just to see how the output varies if we use stringbuilder instead of string to print all binary strings 
// the difference arises as string creates new string everytime we add any element to it, i.e. new reference point is taken 
// but string builder uses the old string only, hence repetitive output of previous recursion is present along with the new value
// hence we need to backtrack the recursion, so as to ensure it gives same output as the string 

public class buggy_all_binary_stringBuilder {

    public static void binary(int len, int idx, StringBuilder sb){

        // base case
        if(idx == len){
            System.out.println(sb);  // incorrect output will happen here
            return;
        }

        // append '1' and go deeper
        sb.append('1');
        binary(len, idx + 1, sb);

        // append '0' and go deeper (without removing '1')
        sb.append('0');
        binary(len, idx + 1, sb);
    }

    public static void main(String[] args) {
        int len = 3;
        StringBuilder sb = new StringBuilder();

        // starting with MSB = 1
        sb.append('1');

        binary(len, 1, sb);
    }
}

