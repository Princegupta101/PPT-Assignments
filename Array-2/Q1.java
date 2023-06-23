import java.util.*;

// 💡 **Question 1**
// Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2),..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.
// Input: nums = [1,4,3,2] // Output: 4
// **Explanation:** All possible pairings (ignoring the ordering of elements) are:
// 1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
// 2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
// 3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
// So the maximum possible sum is 4

public class Q1 {

    public static int Maximumsum(int arr[]) {
        // let's sort the array in assending order
        Arrays.sort(arr);

        // storing the arr.length into n variable;

        int n = arr.length;

        int maxsum = 0;

        // Iterating over the arr element for the maxsum with considering index values
        for (int i = 0; i < n - 1; i += 2) {

            // calculating the addition of minimum value of pair values
            maxsum += Math.min(arr[i], arr[i + 1]);
        }
        return maxsum;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 4, 3, 2 };

        System.out.println(Maximumsum(arr));
    }
}
