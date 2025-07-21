public class reverse_string {

    public static void reverse(String s, int idx){
        if(idx==0) {
            System.out.println(s.charAt(idx));
            return; 
        } 
        System.out.println(s.charAt(idx));
        reverse(s,idx-1); 
    }
    public static void main(String[] args) {
        String s = "hello world";
        int idx = s.length()-1;
        System.out.println("Original string: ");
        System.out.println(s);

        System.out.println("Reversed string: ");
        reverse(s,idx);
        


    }
}
