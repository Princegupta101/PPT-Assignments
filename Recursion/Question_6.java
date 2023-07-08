/*
Question 6

Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
Example 1:
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Question_6{
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        System.out.println(findAnagrams(s,p)); // [0, 6]
    }
    public static List<Integer> findAnagrams(String s, String p) {
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        List<Integer> list = new ArrayList<>();

        if(s.length() < p.length()) return list;
        // Storing the frequencies of string p(will not change) and string s(will update in every window) 
        for(int i = 0; i<p.length(); i++){
            freq1[s.charAt(i) - 'a']++;
            freq2[p.charAt(i) - 'a']++;
        }

        if(Arrays.equals(freq1,freq2)) list.add(0);

        int start = 0;
        int end = p.length();

        while(end < s.length()){
            freq1[s.charAt(start) - 'a']--;
            freq1[s.charAt(end) - 'a']++;

            if(Arrays.equals(freq1,freq2)) list.add(start + 1);
            start++;
            end++;
        }
        return list;
    }
}