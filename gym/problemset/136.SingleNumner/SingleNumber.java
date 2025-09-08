// https://leetcode.com/problems/single-number/
class SingleNumber {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(0 ^ 4);
    }

    private static int singleNumber(int[] nums) {
        int total = 0;

        for (int i : nums) {
            total ^= i;
        }

        return total;
    }

}
