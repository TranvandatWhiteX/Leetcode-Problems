package ExerciseSolved;

import java.util.Arrays;

// Leetcode 896
public class MonotonicArray {
    // Cho một mảng nếu mảng chir tăng dần hoặc giảm dần trả về true, còn không trả về false
    // Test case [1,2,2,3,5,7] -> true
    // [5,4,4,3,1] -> true
    // [1,3,5,2,1] -> false
    public static boolean isMonotonic(int[] nums) {
        boolean isIncreasing = false;
        boolean isDecreasing = false;
        for (int i=0; i< nums.length-1;i++) {
            if (nums[i] == nums[i+1]) {
                continue;
            } else if (nums[i] < nums[i+1]) {
                isIncreasing = true;
            } else {
                isDecreasing = true;
            }
            if (isDecreasing && isIncreasing) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        System.out.println(isMonotonic(arr));
    }
}
