package ExerciseSolved;
// Leet code 343
public class IntegerBreak {
    // Quy luật: n >= 5 => n = 3k + 1 = 3k + 2 = 3(k-1)+4 với k là số số 3 có trong n.
    public static int integerBreak(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        if (n == 4) return 4;
        int k = n / 3, h = n % 3, result=1;
        if (h == 1) {
            k--;
            h += 3;
        }
        for (int i = 1; i <= k; i++) {
            result *= 3;
        }
        if (h!=0) {
            result *= h;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(integerBreak(6));
    }
}
