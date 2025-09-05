// https://leetcode.com/problems/plus-one/
class PlusOne {

    public static void main(String[] args) {
        System.out.println(plusOne(new int[] { 1, 2, 3, 4, 5, 6, 7}));
    }
/*
 * Buffer overflows
    private static int[] plusOne(int[] digits) {
        int total = 1;
        for (int i = digits.length; i > 0; i--) {
            total = total + (digits[i - 1] * (int) Math.pow(10, digits.length - i));
        }
        
        return Integer.toString(total).chars()
            .map(c -> c - '0')
            .toArray();
    }
*/

    private static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits; // no carry, done
			}
			digits[i] = 0; // carry over
		}
		// if we are here, all digits were 9
		int[] result = new int[digits.length + 1];
		result[0] = 1;
		return result;
    }
}
