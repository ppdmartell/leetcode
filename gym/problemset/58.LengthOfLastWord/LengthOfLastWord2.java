// https://leetcode.com/problems/length-of-last-word/
// A more elegant solution, storing the word is not important
// what's important is to count only.

class LengthOfLastWord2 {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    private static int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int length = 0;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

}
