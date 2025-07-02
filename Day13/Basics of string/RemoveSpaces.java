public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "Java is fun";
        
        // Using replaceAll to remove all spaces
        String noSpaces = str.replaceAll(" ", "");

        System.out.println(noSpaces);  // Javaisfun
    }
}
