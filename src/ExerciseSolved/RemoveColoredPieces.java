package ExerciseSolved;

import java.util.StringJoiner;
import java.util.StringTokenizer;

// Leetcode 2038
public class RemoveColoredPieces {
    public static int count(String s, String delim) {
        int count = 0;
        for (int i=0; i<s.length();i++) {
            int index = (s.indexOf(delim, i)!=-1)?(s.indexOf(delim,i)):s.length();
            if (index - i - 2 > 0) {
                count += (index - i -2);
            }
            i = index;
        }
        return count;
    }
    // Bad
    public static boolean winnerOfGameSolution2(String colors) {
        int countA = count(colors, "B");
        int countB = count(colors, "A");
        return countA > countB;
    }
    public static boolean winnerOfGame(String colors) {
        StringTokenizer tokenA = new StringTokenizer(colors, "B");
        int countA = 0;
        while(tokenA.hasMoreTokens()) {
            String token = tokenA.nextToken();
            if (token.length() - 2 > countA) {
                countA = token.length() - 2;
            }
        }

        StringTokenizer tokenB = new StringTokenizer(colors, "A");
        int countB = 0;
        while(tokenB.hasMoreTokens()) {
            String token = tokenB.nextToken();
            if (token.length() - 2 > countB) {
                countB = token.length() - 2;
            }
        }
        if (countA > countB) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String test = "AAABBAAABAAB";
        System.out.println(test.indexOf("B", 4));
    }
}
