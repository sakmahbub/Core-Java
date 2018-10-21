package chapter10;

public class StackOfIntegers {

    private int[] elements;
    private int size;
    public static final int Default_Capacity = 16;

    public StackOfIntegers() {
        this(Default_Capacity);
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];

    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int pop() {
        return elements[--size];
    }

    public int peek() {
        return elements[size - 1];
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
