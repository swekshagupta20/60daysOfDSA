 public class OneStringSubOfOther{

    //same code for needle in a haystack or we can say strStr() method; 
    public static void main (String [] args){
        
        String str = "aaabbbbccddde"; 
        String str2 = "aab";
        boolean flag = false;  

        for (int i = 0; i <= str.length() - str2.length(); i++) {
            String str3 = str.substring(i, i + str2.length());
            if (str3.equals(str2)) {
                flag = true;
                System.out.println("Substring found at index: " + i); 
                break; // once we get the first match we stop 
            }
        }

        //result  
        System.out.println("Is substring a part of the string?: " + flag);

    }
}