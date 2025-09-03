// https://leetcode.com/problems/palindrome-number/
class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String reversed = reverse(Math.abs(x));
        if (x < 0) {
            reversed += "-";
        }
        return reversed.equals(String.valueOf(x));
    }

    private String reverse(int x) {
        String reversed = "";
        boolean flag = false;
        while (!flag) {
            reversed += String.valueOf(x % 10);
            x = x / 10;
            if (x < 10) {
                reversed += x;
                flag = true;
            }
        }

        return reversed;
    }
}
