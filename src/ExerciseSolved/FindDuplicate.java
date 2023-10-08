package ExerciseSolved;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// An array [1,6,5,87,5,4,6,1,3,8,7,4,5,871,5,4]. Tim phan tu lap nhieu nhat
// 5
// Solved
public class FindDuplicate {
    // O(n^2)
    public static int findMaxDuplicate(int arr[]) {
        int result = 1;
        int find = 0;
        int index[] = new int[arr.length];
        Arrays.fill(index, 1);
        for (int i=0;i< arr.length-1; i++) {
            for (int j=i+1; j<arr.length;j++) {
                if (arr[i] == arr[j]) {
                    index[i]++;
                }
            }
            if (index[i] > result) {
                result = index[i];
                find = i;
            }
        }
        return arr[find];
    }
    public static int findMaxDuplicateSolution2(int arr[]) {
        Map<Integer, Integer> numberCount = new HashMap<>();
        int mostRepeatedNumber = 0;
        int maxCount = 0;
        for(int num : arr) {
            if (numberCount.containsKey(num)) {
                numberCount.put(num, numberCount.get(num) + 1);
            } else {
                numberCount.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : numberCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostRepeatedNumber = entry.getKey();
            }
        }
        return mostRepeatedNumber;
    }
    public static void main(String[] args) {
        int[] arr = {1,6,5,87,5,4,6,1,3,8,7,4,5,871,5,4, 620, -854, 4, 4, 4, 62, 4, 120, 4, 5, 4, 4, 874, -10,
                4,8,42,52,15,63,87,94,31,20,-74,-96,4,12,4,-85,5,-5,5,5,4,87,4,4,630,201,1145,4,5,4,4,4,-52,4
        };
        long s1 = System.nanoTime();
        System.out.println(findMaxDuplicate(arr));
        long s2 = System.nanoTime();
        System.out.println(s2 - s1);
        long t1 = System.nanoTime();
        System.out.println(findMaxDuplicateSolution2(arr));
        long t2 = System.nanoTime();
        System.out.println(t2 - t1);
    }
}
