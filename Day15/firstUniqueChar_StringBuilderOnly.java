public class firstUniqueChar_StringBuilderOnly {
    public static void main(String[] args) {
        String str = "loveliness";
        StringBuilder sb = new StringBuilder(str);

        boolean flag = false; 

        for(int i=0; i<sb.length(); i++){
            char x = sb.charAt(i);
            flag = true; 

            for(int j=0; j<sb.length(); j++){
                if(i!=j && x==sb.charAt(j)){
                    flag = false; 
                    break; 
                }
            }
            if(flag){
            System.out.println("First unique character: "+ x);
            break; 
        }
     
    }
        
        if(!flag){
            System.out.println("No unique character found");
        }
    }
}
