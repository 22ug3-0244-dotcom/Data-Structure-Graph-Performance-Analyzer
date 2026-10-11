public class ArrayManager {

    private int[] numbers;
    private int size;

    public ArrayManager(int capacity) {
        numbers = new int[capacity];
        size = 0;
    }

    public void insert(int value) {

        if (size == numbers.length) {
            System.out.println("Array is full.");
            return;
        }

        numbers[size] = value;
        size++;

        System.out.println("Value inserted successfully.");
    }
    