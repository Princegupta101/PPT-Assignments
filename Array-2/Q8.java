
//💡 **Question 8**
// In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i] to nums[i] + x where x is an integer from the range [-k, k]. You can apply this operation at most once for each index i.
// Return the minimum score of nums after applying the mentioned operation at most once for each index in it.
// Input: nums = [1], k = 0 // Output: 0 // **Explanation:** The score is max(nums) - min(nums) = 1 - 1 = 0.

import java.util.Arrays;

public class Q8 {
    public static int minisum(int nums[], int k) {
        // if our nums <=1 in this case we will return 0;
        if (nums.length <= 1) {
            return 0;
        }
        // let's declare min and max and ans
        Arrays.sort(nums);
        int n = nums.length - 1;
        int min = nums[0];
        int max = nums[n - 1];
        int ans = max - min;
        // adding k in min and max
        min += k;
        max -= k;

        // here we are swapiing min with max
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }

        for (int i = 0; i < n - 1; i++) {
            // starting min
            int currmin = nums[i] - k;
            // currmax
            int currmax = nums[i] + k;

            // This is logical opration to get min using nested if else
            if (currmin > max || currmax < min) {
                continue;
            }

            else if (max - currmin <= currmax - min) {
                min = max;
            } else {
                max = currmax;
            }
        }
        // finally using Math.min property to get min
        return Math.min(ans, min - max);
    }

    public static void main(String[] args) {
        int nums[] = { 1 };
        int k = 0;
        System.out.println(Q8.minisum(nums, k));
    }
}