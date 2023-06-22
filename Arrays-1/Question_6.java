import java.util.HashMap;

/** **Q6.** Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 *
 * **Example 1:**
 * Input: nums = [1,2,3,1]
 *
 * Output: true
 * */


public class Question_6 {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.size() == 0 || !hm.containsKey(nums[i])) {
                hm.put(nums[i], 1);
            } else
                return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
}
