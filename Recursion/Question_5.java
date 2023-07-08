/*
Question 5

Given an array of characters chars, compress it using the following algorithm:
Begin with an empty string s. For each group of consecutive repeating characters in chars:
If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.
After you are done modifying the input array, return the new length of the array.
You must write an algorithm that uses only constant extra space.
Example 1:
Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation:
The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
 */

class Question_5{
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        int res = compress(chars);
        System.out.println(res); // 6
    }
    public static int compress(char[] chars) {
        String s = String.valueOf(chars);
        String ans = compression(s);
        for(int i =0; i < ans.length(); i++){
            chars[i] = ans.charAt(i);
        }
        return ans.length();
    }
    public static String compression(String str){
        if(str.length() == 0) return "";

        char ch = str.charAt(0);
        int i = 1;
        while(i < str.length() && str.charAt(i) == ch) i++;

        String ros = compression(str.substring(i));
        if(i == 1) return ch + ros;
        return ch + Integer.toString(i) + ros;
    }
}