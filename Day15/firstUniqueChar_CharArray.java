public class firstUniqueChar_CharArray {

    // here we use two boolean values isunique - to tell if element we are checking is unique or not 
    // and other one is to check if we have any unique element or not present inside our string or we can say character array 
    public static void main(String[] args) {
        String str = "loveliness";
        char[] freq = str.toCharArray();  //converting string to character array 

        boolean flag = false; 
        for(int i=0; i<freq.length; i++){
            boolean isUnique = true; 
            for(int j=0; j<freq.length; j++){
                if(i!=j && freq[i]==freq[j]){
                    isUnique = false; 
                    break; 
                }
            }

            if(isUnique){
                System.out.println("Unique element found: ");
                System.out.println("Index is: "+ i);
                System.out.println("Character is:" + freq[i]);
                flag = true; 
                break; 
            }
        }
        if(!flag){
            System.out.println("No unique element present");
        }
        
    }
}
