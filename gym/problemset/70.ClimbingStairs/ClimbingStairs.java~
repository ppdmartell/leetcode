//https://leetcode.com/problems/climbing-stairs/
class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairsRecursion(8));
        System.out.println(climbStairs(5));
    }

    private static int climbStairsRecursion(int n) {
        // Modified Fibonacci, wasn't accepted due to recursion stack increased.
        int total = 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        total += climbStairsRecursion(n - 1) + climbStairsRecursion(n - 2);
        return total;
    }

    private static int climbStairs(int n) {
        // Accepted
        int x = 1, y = 2;
        int total = 0;
        if (n == 1) return x;
        if (n == 2) return y;
        for (int i = 3; i <= n; i++) {
            total = x + y;
            x = y;
            y = total;
        }

        return total;
    }

}
