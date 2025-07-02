 public class compressString{
    public static void main (String [] args){
        
        String str = "aaabbbbccddde"; 
        String result = ""; 

        int count = 1;
        for(int i=1; i<str.length(); i++){
             
            char x = str.charAt(i);
            char y = str.charAt(i-1);

            if(x==y){
                count++;    
            }
            else{
                result+= y;  
                if(count>1) result+=count;  
                count = 1; 
            }
        }
        //adding last digit and its count 
        result += str.charAt(str.length() - 1);
        if(count>1) result+=count; 
        System.out.println(result);

    }
}