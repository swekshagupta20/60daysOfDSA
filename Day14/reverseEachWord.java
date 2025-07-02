//basic code without string builder in result string can be inefficient for longer strings 
public class reverseEachWord{
    public static void main (String [] args){
        
        String str = "I am a girl"; 
        String result = ""; // for more efficient code we can also use-> StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char x = str.charAt(i);

            if(x!=' '){
                sb.append(x);
            }
            else{
                sb.reverse();
                result+= sb;   // if result is also a string builder then -> result.append(sb);
                result+= " ";  // if result is also a string builder then -> result.append(" ");

                //we empty the string builder for the next word 
                sb.delete(0,sb.length()); // if result is also a string builder then -> sb.setLength(0);
            }
        }

        // as our last word is left so we add that in the result string as well
        sb.reverse(); 
        result+= sb;   // if result is also a string builder then -> result.append(sb);
        System.out.println(result);

    }
}