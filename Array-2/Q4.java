
// 💡 **Question 4**
// flowers cannot be planted in adjacent plots.
// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
// Input: flowerbed = [1,0,0,0,1], n = 1 // Output: true

public class Q4{
    public static boolean isflowerbad(int flowerbed[], int n) {
        int count = 0;
        int f = flowerbed.length - 1;
        int i = 0;

        // using while loop with starting(i) and ending(f) to get flowere the plant;

        while (i < f) {
            // using logical && if both case got true than we will increase the count++ and
            // plant the flowerbed 1
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) &&
                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
            if (count >= n) {
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int flowerbed[] = { 1, 0, 0, 0, 1 };
        int n = 1;
        System.out.println(Q4.isflowerbad(flowerbed, n));
    }
}