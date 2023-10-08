package ExerciseSolved;
// Solved
public class FindTheDifferentCharacter {
    public static char findTheDifferent(String s, String t) {
        int sumOfStringS = 0;
        int sumOfStringT = t.charAt(t.length()-1);
        for (int i=0; i<s.length();i++) {
            char cos = s.charAt(i);
            char cot = t.charAt(i);
            sumOfStringS += cos;
            sumOfStringT += cot;
        }
        return (char) (sumOfStringT - sumOfStringS);
    }

    public static void main(String[] args) {
        System.out.println(findTheDifferent("hello", "ellohz"));
    }
}
