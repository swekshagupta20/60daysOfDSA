public class count_ways_to_climb_fibonacci {
   

    public static int countWays(int n) {
        if (n == 0 || n == 1) return 1; // base cases
        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(countWays(2));  // Output: 2
        System.out.println(countWays(3));  // Output: 3
        System.out.println(countWays(5));  // Output: 8
        System.out.println(countWays(10)); // Output: 89
    }   
}
