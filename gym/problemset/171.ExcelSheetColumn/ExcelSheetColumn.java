// https://leetcode.com/problems/excel-sheet-column-number/description/
class ExcelSheetColumn {

    public static void main(String[] args) {
        System.out.println(toInt('A'));
        System.out.println(toInt('Z'));
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("ZY"));
    }

    private static int titleToNumber(String columnTitle) {
       int total = 0;
       int length = columnTitle.length();
       for (int i = length; i > 0; i--) {
           total += toInt(columnTitle.charAt(i - 1)) * Math.pow(26, length - i);
       }

       return total;
    }

    private static int toInt(char c) {
        return c - '0' - 16;
    }

}
