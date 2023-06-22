/**
 **Q8.** You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

 You are given an integer array nums representing the data status of this set after the error.

 Find the number that occurs twice and the number that is missing and return them in the form of an array.

 **Example 1:**
 Input: nums = [1,2,2,4]
 Output: [2,3]
 *
 * **/
// NOTE :- i have writen the method because this question is already present in Leet code :- NO.645
public class Question_8 {
        public int[] findErrorNums(int[] nums) {

            long n = nums.length;
            long sn = (n*(n+1))/2;
            long s2n = (n*(n+1)*(2*n+1))/6;
            long s=0,s2=0;
            for(int i=0;i<n;i++)
            {
                s+=nums[i];
                s2+=nums[i]*nums[i];
            }
            long val1 = s-sn;
            long val2 = s2 -s2n;
            val2 = val2/val1;
            long x = (val1+val2)/2;
            long y = x-val1;
            int[] ans = {(int)x,(int)y};
            return ans;

        }




}
