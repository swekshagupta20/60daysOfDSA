// printing all possible combinations of every length possible in a string 
// len0 +len1+ len2 + ----- +len n
//nc0+nc1+nc2+----+ncn = 2^n (using binomial expansion )
public class no_of_all_possible_combinations {
    public static void main(String[] args) {
        String s ="abc"; 
        System.out.println("Number of total possible combinations of every length <n would be: ");
        int len = s.length(); 
        int num = (int)Math.pow(2,len); // if including empty string, or else -1
        System.out.println(num);
    }
}
