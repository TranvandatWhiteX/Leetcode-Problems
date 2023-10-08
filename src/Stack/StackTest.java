package Stack;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
//        ArrayBasedStack<String> list = new ArrayBasedStack<>(3);
//        list.push("Tran Dat");
//        list.push("Tran Hau");
//        list.push("Ngo Thao");
//        list.push("Tran Truong");
//        System.out.println(list.size());
//        System.out.println(list.peek());

//        Stack<String> list = new Stack<>();
//        list.push("Dat");
//        list.push("Hau");
//        list.push("Truong");
//        for (String i: list) {
//            System.out.println(i);
//        }

        LinkedListBasedStack<String> stack = new LinkedListBasedStack<String>();
        stack.push("Dat");
        stack.push("Khanh");
        stack.push("Thao");
        stack.push("Truong");

        System.out.println(stack.size());
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.size());
        System.out.println(stack.peek());
    }
}
