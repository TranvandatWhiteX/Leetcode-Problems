package ExerciseSolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HIT_Test {
    // O(n ^ 2)
    public static int[] solution(int[] nums) {
        int lengthOfNums = nums.length;
        int[] track = new int[lengthOfNums];
        for (int i=0; i< lengthOfNums;i++) {
            track[i] = nums[i] % 3;
        }
        for (int i=0;i < lengthOfNums-1;i++) {
            for (int j=i+1; j<lengthOfNums;j++) {
                if (track[i] > track[j]) {
                    swap(track, i, j);
                    swap(nums, i, j);
                }
                if (track[i] == track[j]) {
                    if (nums[i] > nums[j]) {
                        swap(nums, i, j);
                    }
                }
            }
        }
        return nums;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // O(n * log(n))
    public static int[] solution2(int[] nums) {
        List<Integer> list_0 = new ArrayList<>();
        List<Integer> list_1 = new ArrayList<>();
        List<Integer> list_2 = new ArrayList<>();
        for (int num : nums) {
            if (num % 3 == 0) list_0.add(num);
            if (num % 3 == 1) list_1.add(num);
            if (num % 3 == 2) list_2.add(num);
        }
        if (!list_0.isEmpty()) {
            list_0.sort(Integer::compareTo);
        }
        if (!list_1.isEmpty()) {
            list_1.sort(Integer::compareTo);
        }
        if (!list_2.isEmpty()) {
            list_2.sort(Integer::compareTo);
        }
        list_0.addAll(list_1);
        list_0.addAll(list_2);
        return list_0.stream().mapToInt(i -> i).toArray();
    }
    // O(n * log(n))
    static class CustomComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer num1, Integer num2) {
            int remainder1 = num1 % 3;
            int remainder2 = num2 % 3;

            if (remainder1 != remainder2) {
                return Integer.compare(remainder1, remainder2);
            } else {
                return Integer.compare(num1, num2);
            }
        }
    }
    public static int[] solution3(int[] nums) {
        Integer[] integers = new Integer[nums.length];
        for(int i=0;i< nums.length;i++) {
            integers[i] = Integer.valueOf(nums[i]);
        }
        Arrays.sort(integers, new CustomComparator());
        return Arrays.stream(integers).mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) {
        int[] test = {1,6,8,7,12,3,5,31,14,19,16};
        int[] result = solution3(test);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
