/*
Question 5
You are given a large integer represented as an integer array digits, where each
digits[i] is the ith digit of the integer. The digits are ordered from most significant
to least significant in left-to-right order. The large integer does not contain any
leading 0's.

Increment the large integer by one and return the resulting array of digits.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]

Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
 */

import java.util.Arrays;

public class Question_5 {
    public static void main(String[] args) {
        int[] digits = {9,9,9};
        System.out.println(Arrays.toString(plusOne(digits))); //[1, 0, 0, 0]
    }

    public static int[] plusOne(int[] digits) {
        if (digits.length == 0)
            return digits;
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] += 1;
            return digits;
        } else {
            int len = digits.length - 1;
            for (; len >= 0; len--) {
                if (digits[len] != 9)
                    break;
                else
                    digits[len] = 0;
            }
            if (len >= 0) {
                digits[len] += 1;
            } else {
                int[] newDigits = new int[digits.length + 1];
                newDigits[0] = 1;
                return newDigits;
            }
            return digits;
        }
    }
}
