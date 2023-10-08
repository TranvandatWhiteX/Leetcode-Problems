package ExcerciseNotSolved;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestStringChain {
    public static int longestStrChain(String[] words) {
        Arrays.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        Map<String, Integer> map = new HashMap<>();
        int ans = 0;

        for (String word : words) {
            int longest = 0;
            for (int i = 0; i < word.length(); i++) {
                StringBuilder sub = new StringBuilder(word);
                sub.deleteCharAt(i);
                String subStr = sub.toString();
                longest = Math.max(longest, map.getOrDefault(subStr, 0) + 1);
            }
            map.put(word, longest);
            ans = Math.max(ans, longest);
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] str = {"a","b","ba","bca","bda","bdca"};
        System.out.println(longestStrChain(str));
    }
}
