package DynamicArray;

import java.util.Iterator;
import java.util.Objects;

public class DynamicArrayImpl<E> implements DynamicArray<E>{
    private Object[] elementData;
    private int size = 0;
    private int capacity = 0;
    public DynamicArrayImpl() {
        this.elementData = new Object[10];
        this.capacity = 10;
    }
    public DynamicArrayImpl(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[10];
            this.capacity = initialCapacity;
        } else {
            throw new IllegalArgumentException("Illegal Argument" + initialCapacity);
        }
    }
    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public E get(int index) {
        return (E) elementData[index];
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public void set(int index, E element) {
        Objects.checkIndex(index, this.size);
        elementData[index] = element;
    }

    @Override
    public void add(E element) {
        if(this.size >= this.capacity - 1) {
            this.capacity *= 2;
            Object[] newElementData = new Object[capacity];
            for (int i=0; i < elementData.length;i++) {
                newElementData[i] = elementData[i];
            }
            elementData = newElementData;
        }
        elementData[size++] = element;
    }

    @Override
    public int indexOf(Object o) {
        if(o == null) {
            for (int i=0;i<size;i++) {
                if(elementData[i] == null) return i;
            }
        } else {
            for (int i=0;i<size;i++) {
                if(o.equals(elementData[i])) return i;
            }
        }
        return -1;
    }

    @Override
    public void remove(Object o) {
        int index = indexOf(o);
        removeAt(index);
    }

    @Override
    public void removeAt(int index) {
        if(index >= size || index < 0) throw new IndexOutOfBoundsException();
        Object[] newElementData = new Object[size - 1];
        for(int i=0,j=0; i < size;i++,j++) {
            if(index == i) {
                j--;
            } else {
                newElementData[j] = elementData[i];
            }
        }
        elementData = newElementData;
        capacity = --size;
    }

    @Override
    public void clear() {
        for (int to = this.size,i = this.size = 0; i < this.size; i++) {
            elementData[i] = null;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public E next() {
                return (E) elementData[index++];
            }
        };
    }

    @Override
    public String toString() {
        if(isEmpty()) return "[]";
        else {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i=0;i<size-1;i++) {
                sb.append(elementData[i]).append(", ");
            }
            sb.append(elementData[size-1]).append("]");
            return sb.toString();
        }
    }
}
