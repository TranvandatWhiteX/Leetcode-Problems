package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImpl<E> implements Iterable<E> {
    transient int size;
    transient Node<E> first = null;
    transient Node<E> last = null;

    public LinkedListImpl() {
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
    public void clear() {
        Node<E> currentNode = first;
        while(currentNode != null) {
            Node<E> nextNode = currentNode.next;
            currentNode.item = null;
            currentNode.next = null;
            currentNode.prev = null;
            currentNode = nextNode;
        }
        first = last = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void addLast(E element) {
        if (isEmpty()) {
            first = last = new Node<>(null, element, null);
        } else {
            Node<E> newNode = new Node<>(last, element, null);
            last.next = newNode;
            last = last.next;
        }
        size++;
    }

    public void addFirst(E element) {
        if (isEmpty()) {
            first = last = new Node<>(null, element, null);
        } else {
            Node<E> newNode = new Node<>(null, element, first);
            first.prev = newNode;
            first = first.prev;
        }
        size++;
    }

    public E peekFirst() {
        if (isEmpty()) throw new RuntimeException("Empty Linked List!");
        return first.item;
    }

    public E peekLast() {
        if (isEmpty()) throw new RuntimeException("Empty Linked List!");
        return last.item;
    }

    public E removeFirst() {
        if (isEmpty()) throw new RuntimeException("Empty Linked List!");
        E element = first.item;
        Node<E> next = first.next;
        first.item = null;
        first.next = null;
        first = next;
        if (next == null) {
            last = null;
        } else {
            next.prev = null;
        }
        size--;
        return element;
    }

    public E removeLast() {
        if (isEmpty()) throw new RuntimeException("Empty Linked List!");
        E element = last.item;
        Node<E> prev = last.prev;
        last.item = null;
        last.prev = null;
        last = prev;
        if (prev == null) {
            first = null;
        } else {
            prev.next = null;
        }
        size--;
        return element;
    }
    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
