import java.util.*;

//  💡 **Question 2**
// Alice has n candies,(n is always even),she only eats n / 2 of them
// Input: candyType = [1,1,2,2,3,3] // Output: 3

public class Q2 {

    public static int differentcandy(int candyType[]) {
        // we can directly take make length half for this case so we will get our
        // anssere

        // int n=candyType.length;
        // int maximumnumber=n/2;
        // return maximumnumber;

        // Let's use HashSet if we consider other test cases

        HashSet<Integer> candy = new HashSet<>();

        // she can eats only n/2 candies
        int eatcandy = candyType.length / 2;

        // for each loop on candyType

        for (int i : candyType) {
            if (candy.size() >= eatcandy)
                return eatcandy;
            else
                candy.add(i);
        }

        return Math.min(candy.size(), eatcandy);
    }

    public static void main(String[] args) {
        int candyType[] = { 1, 1, 2, 2, 3, 3 };
        // calling the function
        System.out.println(Q2.differentcandy(candyType));

    }
}