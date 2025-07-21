// recursive function to count number of vowels and consonents in a string

public class count_vowel_consonent {

    public static void count(String str, int count_vowel, int count_conso, int idx){

        // base case 
        if(idx == str.length()){
            System.out.println("Number of vowels are: " + count_vowel);
            System.out.println("Number of consonents are: " + count_conso );
            return; 
        }

        char check = str.charAt(idx) ;
        // assuming all characters of string are lowercase or else we will convert them to lowercase using str.toLowerCase()
        if(check=='a' || check =='e' || check =='i' || check =='o' || check =='u'){
            count_vowel++; 
            count(str, count_vowel, count_conso, idx+1); 
        }
        else{
            count_conso++;
            count(str, count_vowel, count_conso, idx+1);
        }

    }

    public static void main(String[] args) {
        String s = "abcdefgh";
        
        System.out.println("Printing number of vowels and consonents: ");

        count(s, 0, 0, 0); 

    }
    
}
