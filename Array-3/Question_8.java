/*
Question 8
Given an array of meeting time intervals where intervals[i] = [starti, endi],
determine if a person could attend all meetings.

Example 1:
Input: intervals = [[0,30],[5,10],[15,20]]
Output: false
 */
import java.util.Arrays;
public class Question_8 {
    public static void main(String[] args) {
        int[][] intervals = {{0,30},{5,10},{15,20}};
        System.out.println(personCouldAttendAllMeetings(intervals));
    }
    public static boolean personCouldAttendAllMeetings(int[][] intervals){
        Arrays.sort(intervals,(ele1,ele2) -> Integer.compare(ele1[1],ele2[1])); //Sort according to end time
        for(int i = 0;i < intervals.length;i++){ //If current end time is greater than next start time then return false
            if(intervals[i][1] > intervals[i+1][0]) return false; 
        }
        return true;
    }
}
