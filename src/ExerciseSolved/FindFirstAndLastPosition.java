package ExerciseSolved;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;

// Leetcode 34
public class FindFirstAndLastPosition {
    // Linear Search
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int count = 0;
        for (int i = 0; i< nums.length;i++) {
            if (nums[i] == target) {
                if (count == 0) result[0] = i;
                count++;
            }
            if (nums[i] > target) break;
        }
        if (count != 0) result[1] = count + result[0]-1;
        return result;
    }

    public static void main(String[] args) {
        int[] input = {5,7,8,8,8,8,8,8,8,10};
        int[] output = searchRange(input, 8);
        System.out.println(output[0] + " " + output[1]);
    }
}
