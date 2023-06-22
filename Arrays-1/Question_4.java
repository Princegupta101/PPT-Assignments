/**
 You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

**Example 1:**
Input: digits = [1,2,3]
Output: [1,2,4]

**Explanation:** The array represents the integer 123.

Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
*
*
* */

// NOTE : - I have  writen just the function solve above problem beacause same problem present on LeetCode :- Q-no 66
public class Question_4 {

        public int[] plusOne(int[] digits) {
            int n = digits.length-1;
            if(digits[n]!=9)
            {
                digits[n]=digits[n]+1;
                return digits;
            }
            else
            {
                int[] res = new int[digits.length+1];
                int idx=n;
                while(idx>=0)
                {
                    if(digits[idx]==9)
                    {
                        digits[idx]=0;
                        idx--;
                    }
                    else
                    {
                        digits[idx]=digits[idx]+1;
                        return digits;
                    }
                }
                res[0]=1;
                return res;

            }

        }
}
