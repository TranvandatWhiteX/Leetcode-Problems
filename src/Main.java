import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Integer a = 500;
//        Integer b = 500;
//        System.out.println(a == b);
//        Integer x = 100;
//        Integer y = 100;
//        System.out.println(x == y);
//        String str = "Tran Van Dat";
//        String newStr = str;
//        System.out.println(str == newStr);
//        String otherStr = new String("Tran Van Dat");
//        System.out.println(str == otherStr);
//        List<String> list = new ArrayList<>();
//        list.add("Dat");
//        list.add("Truong");
//        System.out.println(list.get(0));
//        Vector<String> vector = new Vector<>();
//        vector.add("Tran Dat");
//        vector.add("Ngo Thao");
//        System.out.println(vector.get(0));
        SortedSet<String> strings = new TreeSet<>();
        strings.add("Ha Noi");
        strings.add("Can Tho");
        strings.forEach(System.out::println);
    }
}