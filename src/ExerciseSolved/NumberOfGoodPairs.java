package ExerciseSolved;

import java.util.Arrays;
import java.util.HashMap;

public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i=0; i<nums.length-1;i++) {
            for (int j=i+1; j<nums.length;j++) {
                if (nums[i] == nums[j]) count++;
            }
        }
        return count;
    }
    public static int numIdenticalPairsSolution2(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int result = 0;
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            result += count.get(num) - 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairsSolution2(test));
    }
}
