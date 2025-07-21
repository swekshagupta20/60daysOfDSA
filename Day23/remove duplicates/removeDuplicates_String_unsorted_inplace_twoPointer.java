// i will start from index 0 and will keep a track of non duplicate elements 
// j will start from sb.length()-1 and will remove duplicates while it is >i
// we traverse j from end to starting so as to ensure no change in index values of element to be removed during a specific iteration 


public class removeDuplicates_String_unsorted_inplace_twoPointer {

    public static void removeDuplicates(StringBuilder sb, int i, int j){

        if(i==sb.length()){
            System.out.println(sb.toString());
            return; 
        }
        
        //recursive function to remove character if it is same as at index i
        removeInner(sb,i,j);

        // now checking for next character 
        removeDuplicates(sb, i+1, sb.length()-1); //initial j is always current length of string builder
    }



    public static void removeInner(StringBuilder sb, int i, int j){
        if(j==i) return; 

        if(sb.charAt(i)==sb.charAt(j)){
            sb.deleteCharAt(j);
        }

        removeInner(sb, i, j - 1);
    }

    public static void main(String[] args) {

        String s = "abbcdca"; 
        StringBuilder sb = new StringBuilder(s);
        int len = sb.length()-1; 
        removeDuplicates(sb, 0, len); 
    }
    
}
