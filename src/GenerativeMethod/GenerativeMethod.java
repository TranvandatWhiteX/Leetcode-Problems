package GenerativeMethod;

import java.util.ArrayList;
import java.util.List;

public class GenerativeMethod {
    public static List<String> binaryString(int n) {
        int[] binary = new int[n+1];
        int i;
        List<String> listBinary = new ArrayList<>();
        do {
            i = n;
            StringBuilder sb = new StringBuilder();
            for(int j=1;j<=n;j++) {
                sb.append(binary[j]);
            }
            listBinary.add(sb.toString());
            while (i>0 && binary[i] == 1) {
                i--;
            }
            if (i > 0) {
                binary[i] = 1;
                i++;
                while(i<=n) {
                    binary[i] = 0;
                    i++;
                }
            }
        } while (i>0);
        return listBinary;
    }
    public static void main(String[] args) {
        binaryString(3).stream().forEach(System.out::println);
    }
}
