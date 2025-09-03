// https://leetcode.com/problems/longest-common-prefix/

class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"interview",
        "internet",
        "internal",
        "interval",
        "into",
        "integration",
        "integer",
        "intake",
        "intuitive",
        "intense"};

        System.out.println(longestCommonPrefix(strs));
    }

    private static String longestCommonPrefix(String[] strs) {

        // Finding the smallest word
        String smallest = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < smallest.length()) {
                smallest = strs[i];
            }
        }

        // Shrinking the word and comparing against it
        String prefix = smallest;
        for (int i = 0; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.length() == 0) return "";
            }
        }

        return prefix;
    }

}
