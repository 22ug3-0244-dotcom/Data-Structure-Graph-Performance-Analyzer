public class PerformanceManager {

    public void displayComplexity() {

        System.out.println();
        System.out.println("=============================================");
        System.out.println("          PERFORMANCE / COMPLEXITY");
        System.out.println("=============================================");

        System.out.println("Array Search        : O(n)");
        System.out.println("Array Insert        : O(1) average");
        System.out.println("Array Delete        : O(n)");

        System.out.println("Stack Push          : O(1)");
        System.out.println("Stack Pop           : O(1)");
        System.out.println("Stack Peek          : O(1)");

        System.out.println("Queue Enqueue       : O(1)");
        System.out.println("Queue Dequeue       : O(1)");
        System.out.println("Queue Peek          : O(1)");

        System.out.println("Linked List Search  : O(n)");
        System.out.println("Linked List Insert  : O(n)");
        System.out.println("Linked List Delete  : O(n)");

        System.out.println("Linear Search       : O(n)");
        System.out.println("Binary Search       : O(log n)");

        System.out.println("BFS                 : O(V + E)");
        System.out.println("DFS                 : O(V + E)");

        System.out.println("=============================================");
    }

    public void compareSearching() {

        int[] numbers = new int[10000];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = i + 1;
        }

        int target = 9999;

        long startTime = System.nanoTime();

        int linearResult = linearSearch(
                numbers,
                target
        );

        long linearTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();

        int binaryResult = binarySearch(
                numbers,
                target
        );

        long binaryTime = System.nanoTime() - startTime;

        System.out.println();
        System.out.println("=============================================");
        System.out.println("          SEARCH PERFORMANCE");
        System.out.println("=============================================");

        System.out.println(
                "Linear Search Result: " + linearResult
        );

        System.out.println(
                "Linear Search Time: " + linearTime + " ns"
        );

        System.out.println(
                "Binary Search Result: " + binaryResult
        );

        System.out.println(
                "Binary Search Time: " + binaryTime + " ns"
        );

        System.out.println("=============================================");
    }

    private int linearSearch(
            int[] numbers,
            int target) {

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {

                return i;
            }
        }

        return -1;
    }

    private int binarySearch(
            int[] numbers,
            int target) {

        int left = 0;

        int right = numbers.length - 1;

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

        return -1;
    }
}