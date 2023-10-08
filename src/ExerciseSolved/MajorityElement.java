package ExerciseSolved;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Leetcode 229
public class MajorityElement {
    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i:nums) {
            count.put(i, count.getOrDefault(i, 0)+1);
        }
        int length = nums.length / 3;
        return count.entrySet().stream()
                .filter(entry -> entry.getValue() > length)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] input = {3,2,3};
        majorityElement(input).forEach(System.out::println);
    }
}
