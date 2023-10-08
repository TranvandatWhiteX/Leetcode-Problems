package ExcerciseNotSolved;
//Leetcode 1458
public class MaxDotProductOfTwoSubsequences {
    public static int maxDotProduct(int[] nums1, int[] nums2) {
        int[][] max = new int[nums1.length][nums2.length];
        int result = 0;
        for(int i=0;i<nums1.length;i++) {
            for (int j=0;j<nums2.length;j++) {
                max[i][j] = nums1[i] * nums2[j];
            }
        }
        for (int i=0;i<nums1.length;i++) {
            int index = 0;
            int temp = 0;
            for (int j=0;j<nums2.length;j++) {
                if (max[i][j] > temp) {
                    temp = max[i][j];
                    index = j;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {

    }
}
