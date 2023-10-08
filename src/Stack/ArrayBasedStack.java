package Stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;

public class ArrayBasedStack<E> implements StackADT<E> {
    private final ArrayList<E> stack;
    private int index = -1;

    public ArrayBasedStack(int initialSize) {
        this.stack = new ArrayList<>(initialSize);
    }

    @Override
    public void push(E element) {
        index++;
        stack.add(element);
    }

    @Override
    public E pop() {
        if(stack.isEmpty()) throw new EmptyStackException();
        return stack.remove(index--);
    }

    @Override
    public E peek() {
        return stack.get(index);
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public Iterator<E> iterator() {
        return stack.iterator();
    }
}
