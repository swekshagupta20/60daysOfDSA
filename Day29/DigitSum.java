// goal is to find digit sum until you get single digit 
public class DigitSum {
    public static int sumDigits(int n) {
        if (n < 10) return n;

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sumDigits(sum);  // recursive call
    }

    public static void main(String[] args) {
        int num = 987;
        System.out.println(sumDigits(num));  // Output: 6
    }
}
