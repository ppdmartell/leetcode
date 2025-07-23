/*https://leetcode.com/problems/two-sum/description/
 *
 * My solution is a two-pass hash table. However, it could be made better with one pass.
 * Please check the problem in leetcode using the url
*/

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class TwoSum {

    public static void main(String[] args) {
        int target = 6;
        int[] array = {3, 2, 4};
        Arrays.stream(twoSum(array, target)).forEach(System.out::println);
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        } 

        return new int[0];
    }

}
