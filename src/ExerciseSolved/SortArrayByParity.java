package ExerciseSolved;

import java.util.ArrayList;
import java.util.List;

// Leetcode 905
public class SortArrayByParity {
    // Bad =)))
    public static int[] sortArrayByParity(int[] nums) {
        List<Integer> arrayOfEven = new ArrayList<>();
        List<Integer> arrayOfOdd = new ArrayList<>();
        for (int i=0; i<nums.length;i++) {
            if (nums[i] % 2 == 0) {
                arrayOfEven.add(nums[i]);
            } else {
                arrayOfOdd.add(nums[i]);
            }
        }
        arrayOfEven.addAll(arrayOfOdd);
        return arrayOfEven.stream().mapToInt(i -> i).toArray();
     }
     //Good :>
    public static int[] sortArrayByParitySolution2(int[] nums) {
        int start = 0, end = nums.length-1;
        while(start < end) {
            if (nums[start] % 2 == 0) start++;
            else {
                int temp = nums[end];
                nums[end--] = nums[start];
                nums[start] = temp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        //int[] arr = {3,1,2,4, 7,6,12,15,14,78,91,42,31,30,24,28};
        int[] arr = {2,4,5};
        for (int i : sortArrayByParitySolution2(arr)) {
            System.out.println(i);
        }
    }
}
