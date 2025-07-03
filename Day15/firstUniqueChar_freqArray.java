public class firstUniqueChar_freqArray{
    public static void main(String [] args){
        String str = "loveliness";
        int[] freq = new int[256];  //index represents ascii value of characters 

        for(int i=0; i<str.length(); i++){
            char x = str.charAt(i);
            int y = (int) x;  //this line not needed implicit casting 
            freq[y]++; //increasing count of frequency if we come across that element 
     
        }
        boolean flag = false; 
        //finding first element 
        for(int j=0; j<str.length(); j++){
            char ch = str.charAt(j);
            if(freq[ch]==1){ //implicit conversion occurs 
               System.out.println("Unique element found");
               System.out.println("Element is: "+ ch);
               flag = true; 
               break; 
            }
            else{
                flag = false; 
            }
        }
        if(!flag){
            System.out.println("No unique element present");
        }
    }
}