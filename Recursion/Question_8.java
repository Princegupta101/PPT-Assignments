/*
Question 8
Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.
Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].
For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
Example 1:
Input: s = "ab", goal = "ba"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Question_8{
    public static void main(String[] args) {
        String s = "ab", goal = "ba";
        System.out.println(buddyStrings(s,goal)); // true
    }
    public static boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;

        if(s.equals(goal)){
            Set<Character> set = new HashSet<Character>();
            for(char c : s.toCharArray()) set.add(c);
            return set.size() < s.length();
        }
        List<Integer> dif = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)) dif.add(i);
        }
        return dif.size() == 2 && s.charAt(dif.get(0)) == goal.charAt(dif.get(1)) && s.charAt(dif.get(1)) == goal.charAt(dif.get(0));
    }
}