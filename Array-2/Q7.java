

// main logic to solve this probleam is given as  monotone increasing if for all i <= j, nums[i] <= nums[j] and for
// monotone decreasing if for all i <= j, nums[i] >= nums[j].
// Input: nums = [1,2,2,3] // Output: true

public class Q7 {

    public static boolean ismonotonic(int nums[]) {
        int n = nums.length;
        boolean incmono = true;
        boolean decmono = true;

        // Iterateing over the nums for non inc and non dec

        for (int i = 0; i < n - 1; i++) {
            // conditon for non Increaing monoton
            if (nums[i] > nums[i + 1])
                incmono = false;
            // conditon for non decreaing monoton
            if (nums[i] < nums[i + 1])
                decmono = false;
        }
        return incmono || decmono;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 3 }; // true
        // int nums[]={5,2,3,3}; // false
        System.out.println(Q7.ismonotonic(nums));
    }
}