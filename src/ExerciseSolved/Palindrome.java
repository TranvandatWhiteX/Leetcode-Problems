package ExerciseSolved;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10 && x >= 0) return true;
        String nums = String.valueOf(x);
        StringBuilder sb = new StringBuilder(nums);
        if (nums.equals(sb.reverse().toString())) return true;
        else return false;
    }
    public static boolean isPalindromeSolution2(int x) {
        if (x < 0) return false;
        if (x < 10 && x >= 0) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
