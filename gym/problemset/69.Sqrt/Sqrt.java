// https://leetcode.com/problems/sqrtx/description/
// THIS IS NOT THE SOLUTION


class Sqrt {

    public static void main(String[] args) {
        System.out.println((int) mySqrt(8));
    }

    private static int mySqrt(int x) {
        double high = x;
        double low = 0;
        double mid = 0;

        while (high - low > 1e-6) {
            mid = (high + low) / 2;
            if (mid * mid > x) {
                high = mid;
            } else {
                low = mid;
            }
        }

        return (int) mid;

    }

}
