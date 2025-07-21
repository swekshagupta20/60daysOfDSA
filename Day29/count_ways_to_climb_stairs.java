// you can take either one or two steps at a time. 

public class count_ways_to_climb_stairs {
    public static int countPaths(int n, String path) {
        if (n == 0) {
            System.out.println(path.trim()); // to avoid putting space after last char 
            return 1;
        }
        if (n < 0) return 0;

        int oneStep = 0; 
        int twoStep = 0;

        if (n - 1 >= 0) {
            oneStep = countPaths(n - 1, path + "1 ");
        }
        if (n - 2 >= 0) {
            twoStep = countPaths(n - 2, path + "2 ");
        }

        return oneStep + twoStep;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Paths to climb " + n + " stairs:");
        int total = countPaths(n, "");
        System.out.println("Total ways: " + total);
    }
}

