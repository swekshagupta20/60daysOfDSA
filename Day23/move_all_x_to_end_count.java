//moving all x to the end using count function 
//do not change the order of occurance of other elements in string 

public class move_all_x_to_end_count {

    public static void move(String str, int idx, int count, String str2){

        if(idx==str.length()){

            for(int i=0; i<count; i++){ //adding x's to end of string 
                str2+= 'x'; 
            }
            System.out.println(str2);
            return; 
        }


        char current = str.charAt(idx);
        if(str.charAt(idx)=='x'){ // if character is equal to 'x' we increment count 
            count++; 
            move(str, idx+1, count, str2);
        }
        else{  //else we add it to the new string str2
            str2= str2 + current; 
            move(str, idx+1, count, str2);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        move(str, 0, 0, "");
    }
    
}
