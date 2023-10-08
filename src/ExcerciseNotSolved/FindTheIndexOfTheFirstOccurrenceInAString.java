package ExcerciseNotSolved;
// Leetcode 28
public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static int strStr(String haystack, String needle) {
        int hLength = haystack.length();
        int nLength = needle.length();
        if (hLength < nLength) return -1;
        for (int i=0; i<=hLength-nLength;i++) {
            int index=0;
            while(index < nLength && haystack.charAt(i+index)==needle.charAt(index)) {
                index++;
            }
            if (index == nLength) return i;
        }
        return -1;
    }
    public static int strStrOtherCode(String haystack, String needle) {
        int hLength = haystack.length();
        int nLength = needle.length();
        if (hLength < nLength) return -1;
        int index = 0;
        for (int i=0;i<= hLength - nLength;i++) {
            if (haystack.charAt(i) == needle.charAt(index)) {
                index++;
            } else {
                i = i-index;
                index = 0;
            }
            if (index == nLength) return (i-nLength+1);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStrOtherCode("misisspisspi", "issp"));
    }
}
