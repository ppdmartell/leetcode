// https://leetcode.com/problems/search-insert-position/
class SearchInsertposition {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] { 1, 3, 5, 6 }, 7));
    }

    private static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle;

        while (left <= right) {
            middle = (left + right) / 2;

            if (target > nums[middle]) {
                left = middle + 1;
            }
            else if (target < nums[middle]) {
                right =  middle - 1;
            }
            else {
                return middle;
            }
        }

        // When binary search algorithm finishes, left is exactly the index where the
        // target should be inserted.
        return left;
    }

}
