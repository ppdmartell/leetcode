// https://leetcode.com/problems/length-of-last-word/

class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    private static int lengthOfLastWord(String s) {
        StringBuilder lastWord = new StringBuilder();
        boolean spaceBefore = false;

        for (char c : s.toCharArray()) {
            if (c == ' ') spaceBefore = true;
            if (c != ' ' && !spaceBefore) {
                lastWord.append(c);
            }
            if (c != ' ' && spaceBefore) {
                lastWord.setLength(0);
                spaceBefore = false;
                lastWord.append(c);
            }
        }

        return lastWord.length();
    }

}
