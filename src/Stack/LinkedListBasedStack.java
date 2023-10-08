package Stack;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListBasedStack<E> implements StackADT<E> {
    private final LinkedList<E> stack = new LinkedList<>();

    public LinkedListBasedStack() {
    }

    public LinkedListBasedStack(E element) {
        stack.push(element);
    }

    @Override
    public void push(E element) {
        stack.addLast(element);
    }

    @Override
    public E pop() {
        if(stack.isEmpty()) throw new EmptyStackException();
        return stack.removeLast();
    }

    @Override
    public E peek() {
        if(stack.isEmpty()) throw new EmptyStackException();
        return stack.peekLast();
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
