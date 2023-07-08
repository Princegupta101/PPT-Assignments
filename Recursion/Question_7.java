/*
Question 7

Given an encoded string, return its decoded string.
The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
The test cases are generated so that the length of the output will never exceed 105.
Example 1:
Input: s = "3[a]2[bc]"
Output: "aaabcbc"
 */

import java.util.Stack;

class Question_7 {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(decodeString(s)); //aaabcbc
        }

    public static String decodeString(String s) {
        Stack<Integer> is = new Stack<>();
        Stack<String> ss = new Stack<>();
        int ptr = 0;
        String res = "";
        while (ptr < s.length()) {
            char curr = s.charAt(ptr);
            if (Character.isDigit(curr)) {
                int num = 0;
                // e.g. 32[a]
                while (Character.isDigit(s.charAt(ptr))) {
                    num = num * 10 + s.charAt(ptr) - '0';
                    ptr++;
                }
                is.push(num); // Push the integer to Integer Stack
            } else if (curr == '[') {
                ss.push(res); // push the previous result
                res = ""; // start a new string to record the further coming characters
                ptr++;
            } else if (curr == ']') {
                StringBuilder sb = new StringBuilder(ss.pop());
                int count = is.pop();
                for (int i = 1; i <= count; i++) {
                    sb.append(res);
                }
                res = sb.toString();
                ptr++;
            } else {
                res += curr;
                ptr++;
            }
        }
        return res;
    }
}