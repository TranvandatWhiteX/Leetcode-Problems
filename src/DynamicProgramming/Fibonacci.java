package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static Map<Integer, Long> memoize = new HashMap<>();
    public static int fibonacciRecursion(int n) {
        if (n==1 || n==2) return 1;
        return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
    }
    // Đệ quy có nhớ
    public static long fibonacciMemoizeRecursion(int n) {
        if (memoize.containsKey(n)) return memoize.get(n);
        long fibonacci = fibonacciMemoizeRecursion(n-1) + fibonacciMemoizeRecursion(n-2);
        memoize.put(n, fibonacci);
        return fibonacci;
    }
    public static long fibonacciBasicLoop(int n) {
        if (n==1 || n==2) return 1;
        for (int i=3; i<=n;i++) {
            var value = memoize.get(i-1) + memoize.get(i-2);
            memoize.put(i, value);
        }
        return memoize.get(n);
    }
    public static long fibonacciFastLoop(int n) {
        if (n==1 || n==2) return 1;
        long first = 1l, second = 1l;
        for (int i=3;i<=n;i++) {
            second = first + second;
            first = second - first;
        }
        return second;
    }
    public static void main(String[] args) {
        memoize.put(1,1l);
        memoize.put(2,1l);
    }
}
