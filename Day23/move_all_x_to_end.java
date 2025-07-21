//trying to move all 'x' to end by using inplace method 
//if it is a 'x', we shift all of the other characters to left and move the 'x' to the end 
public class move_all_x_to_end {

    public static void move(StringBuilder str, int start, int end){

        if(start>=end){
            System.out.println(str.toString());
            return; 
        }

        if(str.charAt(start)=='a'){
            //we shift all elements from start+1 index to end to one index left 
            for(int i=start; i<end; i++){
                str.setCharAt(i, str.charAt(i+1));
            }
            // setting last char as 'a'
            str.setCharAt(end, 'a');
            
            move(str, start, end-1); //as we have shifted we do not increment start
            //last ele is 'x' so we decrement end in this case 
        }

        else{
            move(str, start+1, end); //we increment start but no change to end
        }
    }
    public static void main(String[] args) {
        String str = "abcaabdaadcbabac";
        StringBuilder str2 = new StringBuilder(str); 
        // here we are moving all 'a' to the end without using new string but by using string builder 

        System.out.println("After shifting all 'a' we get: ");
        move(str2, 0, str.length()-1);



    }
}
