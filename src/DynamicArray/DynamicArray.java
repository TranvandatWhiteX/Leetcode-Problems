package DynamicArray;

public interface DynamicArray<E> extends Iterable<E> {
    int size();
    boolean isEmpty();
    E get(int index);
    boolean contains(Object o);
    void set(int index, E element);
    void add(E element);
    int indexOf(Object o);
    void remove(Object o);
    void removeAt(int index);
    void clear();
}
