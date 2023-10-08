package ExerciseSolved;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class ReserveWordsInString {
    public static String reverseWords(String s) {
        StringTokenizer stringTokenizer = new StringTokenizer(s);
        StringJoiner stringJoiner = new StringJoiner(" ");
        while(stringTokenizer.hasMoreTokens()) {
            StringBuilder stringBuilder = new StringBuilder(stringTokenizer.nextToken());
            stringJoiner.add(stringBuilder.reverse());
        }
        return stringJoiner.toString();
    }
    public static String reserveWordsSolution2(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length();i++) {
            int index = (s.indexOf(" ", i) != -1)?(s.indexOf(" ", i)):s.length();
            String token = s.substring(i, index);
            sb.append(new StringBuilder(token).reverse()).append(" ");
            i = index;
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        System.out.println(reserveWordsSolution2(str));
    }
}
