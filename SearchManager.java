public class SearchManager {

    public int linearSearch(int[] numbers, int size, int target) {

        for (int i = 0; i < size; i++) {

            if (numbers[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public int binarySearch(int[] numbers, int size, int target) {

        int left = 0;
        int right = size - 1;

        while (left <= right) {

            int middle = (left + right) / 2;

            if (numbers[middle] == target) {
                return middle;
            }

            if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }