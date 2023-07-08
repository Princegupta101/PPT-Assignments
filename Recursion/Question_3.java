/*

Question 3

Given two strings word1 and word2, return the minimum number of steps required to make word1 and word2 the same.
In one step, you can delete exactly one character in either string.
Example 1:
Input: word1 = "sea", word2 = "eat"
Output: 2
Explanation: You need one step to make "sea" to "ea" and another step to make "eat" to "ea".
 */
class Question_3 {
    public static void main(String[] args) {
        String word1 = "sea", word2 = "eat";
        System.out.println(minDistance(word1, word2)); // 2
    }

    public static int minDistance(String word1, String word2) {
        return word1.length() + word2.length() - 2 * lcs(word1, word2);
    }

    public static int lcs(String s, String t) {
        if (s.length() == 0 || t.length() == 0)
            return 0;
        if (s.charAt(0) == t.charAt(0))
            return 1 + lcs(s.substring(1), t.substring(1));
        else {
            // 3 cases arises
            int op1 = lcs(s.substring(1), t.substring(1));
            int op2 = lcs(s, t.substring(1));
            int op3 = lcs(s.substring(1), t);
            return Math.max(op1, Math.max(op2, op3));
        }
    }
}