package ExerciseSolved;

import java.util.Stack;

public class Find132Pattern {
    // Time limit exceeded
    public static boolean find132pattern(int[] nums) {
        for (int i=0; i < nums.length - 2;i++) {
            for (int j=i+1;j< nums.length;j++) {
                if (nums[i] < nums[j]) {
                    for (int z = j+1; z < nums.length;z++) {
                        if (nums[j] > nums[z] && nums[i] < nums[z]) return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean find132patternSolution2(int[] nums) {
        int n = nums.length;
        int third = Integer.MIN_VALUE; // Initialize the third value as negative infinity
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < third) {
                return true;
            }
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                third = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,0,3,4};
        System.out.println(find132patternSolution2(arr));
    }
}
