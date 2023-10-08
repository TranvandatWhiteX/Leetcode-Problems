package ExcerciseNotSolved;
//Leetcode 880
public class DecodedStringAtIndex {
//    public static String decodeAtIndex(String s, int k) {
//        StringBuilder sb = new StringBuilder();
//        for (int i=0; i< s.length();i++) {
//            if (Character.isDigit(s.charAt(i))) {
//                StringBuilder sub = new StringBuilder();
//                int count = Character.digit(s.charAt(i), 10) - 1;
//                while(count > 0) {
//                    sub.append(sb);
//                    count--;
//                }
//                sb.append(sub);
//            } else {
//                sb.append(s.charAt(i));
//            }
//        }
//        return String.valueOf(sb.toString().charAt(k-1));
//    }
    public static String decodeAtIndex(String s, int k) {
        long size = 0; // Total size of the decoded string
        int n = s.length();
        // Calculate the total size
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int count = Character.digit(c, 10);
                size *= count; // Adjust the size
            } else {
                size++;
            }
        }
        // Backtrack to find the kth character
        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            k %= size; // Reduce k to a valid index
            if (k == 0 && Character.isLetter(c)) {
                return String.valueOf(c);
            }
            if (Character.isDigit(c)) {
                int count = Character.digit(c, 10);
                size /= count; // Adjust the size
            } else {
                size--;
            }
        }
        return ""; // Should not reach here
    }

    public static void main(String[] args) {
        System.out.println(decodeAtIndex("leet2code3", 10));
    }
}
