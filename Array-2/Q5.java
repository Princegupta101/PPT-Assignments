

// 💡 **Question 5**
// Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
// Input: nums = [1,2,3] // Output: 6

public class Q5 {
    // 1st Brust force app
    public static int maxpro(int nums[]) {

        // Based On Given Inputs
        int max = 0;
        for (int i = 0; i < nums.length - 1; ++i) {
            max = nums[i] * nums[i + 1];
        }
        return max;
    }

    // 2nd Optimized app

    public static int maxprootimized(int nums[]) {
        int n = nums.length;
        // here we can calculte the max porduct of nums using recurrion for n-1,n-2,n-3
        // and so on...
        // let's consider base case if we get index 0=0 then what ever we mulitply with
        // 0 will give us 0
        if (nums[0] == 0) {
            return 0;
        }
        int max = Integer.MAX_VALUE;
        // using Math.max mathod if there is other big length exists
        max = Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[n - 2] * nums[n - 3]);
        return max;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };
        // System.out.println(maxproduct.maxpro(nums));
        System.out.println(Q5.maxprootimized(nums));
    }
}
