import java.util.*;
// 💡 **Question 3**
// A subsequence of an array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.
// Input: nums = [1,3,2,2,5,2,3,7] // Output: 5   **Explanation:** The longest harmonious subsequence is [3,2,2,2,3].

public class  Q3{

    public static int longharmoni(int nums[]) {

        // let's sort the nums

        Arrays.sort(nums);

        // declearing next and curr to check longest
        int next = 1;
        int curr = 0;

        int longesetharmonious = 0;

        // while will not stop until we iterate all the nums to get longest

        while (next < nums.length) {

            // here intilizions and storing the diff value 1;
            int diff = nums[next] - nums[curr];

            if (diff == 1) {
                // using the math.max to get longest
                longesetharmonious = Math.max(longesetharmonious, next - curr + 1);
            }
            if (diff <= 1) {
                next++;
            } else {
                curr++;
            }
        }
        return longesetharmonious;

    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 2, 2, 5, 2, 3, 7 };
        // calling the funtion
        System.out.println(Q3.longharmoni(nums));
    }
}
