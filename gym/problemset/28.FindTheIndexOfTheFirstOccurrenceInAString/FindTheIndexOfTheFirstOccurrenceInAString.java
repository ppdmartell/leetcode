// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
// This solution is not optimal. You can use Kanuth-Morris-Prat. Used String, but should be used
// StringBuilder if you want to concatenate.
class FindTheIndexOfTheFirstOccurrenceInAString {

    public static void main(String[] args) {
        System.out.println(strStr("ohyiuyiuysadbutsad", "sad"));
    }

    private static int strStr(String haystack, String needle) {
        String zoom = "";

        for (int i = 0; i < haystack.length(); i++) {
            zoom += haystack.charAt(i);
            if (zoom.equals(needle)) return i - needle.length() + 1;
            else {
                if (zoom.length() == needle.length()) {
                    zoom = zoom.substring(1, zoom.length());
                }
            }
        }

        return -1;
    }
}
