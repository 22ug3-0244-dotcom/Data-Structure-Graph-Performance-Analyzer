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
    
   public void delete(int value) {

        int index = search(value);

        if (index == -1) {
            System.out.println("Value not found.");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        size--;

        System.out.println("Value deleted successfully.");
    }

    public int search(int value) {

        for (int i = 0; i < size; i++) {

            if (numbers[i] == value) {
                return i;
            }
        }

        return -1;
    }
