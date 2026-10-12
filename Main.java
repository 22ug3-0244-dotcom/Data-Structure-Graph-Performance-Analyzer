import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static ArrayManager arrayManager =
            new ArrayManager(100);

    static SearchManager searchManager =
            new SearchManager();

    static StackManager stackManager =
            new StackManager(50);

    static QueueManager queueManager =
            new QueueManager(50);

    static LinkedListManager linkedListManager =
            new LinkedListManager();

    static GraphManager graphManager =
            new GraphManager();

    static PerformanceManager performanceManager =
            new PerformanceManager();

    public static void main(String[] args) {

        int choice;

        do {

            displayMainMenu();

            choice = getInteger("Enter your choice: ");

            switch (choice) {

                case 1:
                    arrayMenu();
                    break;

                case 2:
                    stackMenu();
                    break;

                case 3:
                    queueMenu();
                    break;

                case 4:
                    linkedListMenu();
                    break;

                case 5:
                    searchMenu();
                    break;

                case 6:
                    graphMenu();
                    break;

                case 7:
                    performanceMenu();
                    break;

                case 8:
                    displayAllResults();
                    break;

                case 9:
                    System.out.println(
                            "Thank you for using the system."
                    );
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Please try again."
                    );
            }

        } while (choice != 9);

        scanner.close();
    }

    // ================= MAIN MENU =================

    static void displayMainMenu() {

        System.out.println();
        System.out.println("=============================================");
        System.out.println("      DATA STRUCTURE & GRAPH ANALYZER");
        System.out.println("=============================================");
        System.out.println("1. Array Operations");
        System.out.println("2. Stack Operations");
        System.out.println("3. Queue Operations");
        System.out.println("4. Linked List Operations");
        System.out.println("5. Searching Operations");
        System.out.println("6. Graph Operations");
        System.out.println("7. Performance Comparison");
        System.out.println("8. Display All Results");
        System.out.println("9. Exit");
        System.out.println("=============================================");
    }

    // ================= INPUT =================

    static int getInteger(String message) {

        while (true) {

            System.out.print(message);

            try {

                return Integer.parseInt(
                        scanner.nextLine()
                );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Please enter a valid number."
                );
            }
        }
    }

    // ================= ARRAY =================

    static void arrayMenu() {

        int choice;

        do {

            System.out.println();
            System.out.println("--------- ARRAY OPERATIONS ---------");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Back");

            choice = getInteger("Enter choice: ");

            switch (choice) {

                case 1:

                    int value =
                            getInteger("Enter value: ");

                    arrayManager.insert(value);

                    break;

                case 2:

                    value =
                            getInteger("Enter value: ");

                    arrayManager.delete(value);

                    break;

                case 3:

                    value =
                            getInteger("Enter value: ");

                    int result =
                            arrayManager.search(value);

                    if (result == -1) {

                        System.out.println(
                                "Value not found."
                        );

                    } else {

                        System.out.println(
                                "Value found at index "
                                        + result
                        );
                    }

                    break;

                case 4:

                    arrayManager.display();

                    break;

                case 5:
                    break;

                default:

                    System.out.println(
                            "Invalid choice."
                    );
            }

        } while (choice != 5);
    }

    // ================= STACK =================

    static void stackMenu() {

        int choice;

        do {

            System.out.println();
            System.out.println("--------- STACK OPERATIONS ---------");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Back");

            choice =
                    getInteger("Enter choice: ");

            switch (choice) {

                case 1:

                    int value =
                            getInteger("Enter value: ");

                    stackManager.push(value);

                    break;

                case 2:

                    stackManager.pop();

                    break;

                case 3:

                    stackManager.peek();

                    break;

                case 4:

                    stackManager.display();

                    break;

                case 5:
                    break;

                default:

                    System.out.println(
                            "Invalid choice."
                    );
            }

        } while (choice != 5);
    }

    // ================= QUEUE =================

    static void queueMenu() {

        int choice;

        do {

            System.out.println();
            System.out.println("--------- QUEUE OPERATIONS ---------");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Back");

            choice =
                    getInteger("Enter choice: ");

            switch (choice) {

                case 1:

                    int value =
                            getInteger("Enter value: ");

                    queueManager.enqueue(value);

                    break;

                case 2:

                    queueManager.dequeue();

                    break;

                case 3:

                    queueManager.peek();

                    break;

                case 4:

                    queueManager.display();

                    break;

                case 5:
                    break;

                default:

                    System.out.println(
                            "Invalid choice."
                    );
            }

        } while (choice != 5);
    }

    // ================= LINKED LIST =================

    static void linkedListMenu() {

        int choice;

        do {

            System.out.println();
            System.out.println(
                    "--------- LINKED LIST OPERATIONS ---------"
            );

            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Back");

            choice =
                    getInteger("Enter choice: ");

            switch (choice) {

                case 1:

                    int value =
                            getInteger("Enter value: ");

                    linkedListManager.insert(value);

                    break;

                case 2:

                    value =
                            getInteger("Enter value: ");

                    linkedListManager.delete(value);

                    break;

                case 3:

                    value =
                            getInteger("Enter value: ");

                    linkedListManager.search(value);

                    break;

                case 4:

                    linkedListManager.display();

                    break;

                case 5:
                    break;

                default:

                    System.out.println(
                            "Invalid choice."
                    );
            }

        } while (choice != 5);
    }

    // ================= SEARCH =================

    static void searchMenu() {

        System.out.println();
        System.out.println(
                "--------- SEARCHING OPERATIONS ---------"
        );

        int target =
                getInteger("Enter value to search: ");

        int[] numbers = {
                10, 20, 30, 40, 50,
                60, 70, 80, 90, 100
        };

        long startTime =
                System.nanoTime();

        int linearResult =
                searchManager.linearSearch(
                        numbers,
                        numbers.length,
                        target
                );

        long linearTime =
                System.nanoTime() - startTime;

        startTime =
                System.nanoTime();

        int binaryResult =
                searchManager.binarySearch(
                        numbers,
                        numbers.length,
                        target
                );

        long binaryTime =
                System.nanoTime() - startTime;

        System.out.println();

        if (linearResult != -1) {

            System.out.println(
                    "Linear Search: Found at index "
                            + linearResult
            );

        } else {

            System.out.println(
                    "Linear Search: Not found"
            );
        }

        System.out.println(
                "Linear Search Time: "
                        + linearTime + " ns"
        );

        if (binaryResult != -1) {

            System.out.println(
                    "Binary Search: Found at index "
                            + binaryResult
            );

        } else {

            System.out.println(
                    "Binary Search: Not found"
            );
        }

        System.out.println(
                "Binary Search Time: "
                        + binaryTime + " ns"
        );
    }

    // ================= GRAPH =================

    static void graphMenu() {

        int choice;

        do {

            System.out.println();
            System.out.println(
                    "--------- GRAPH OPERATIONS ---------"
            );

            System.out.println("1. Add Vertex");
            System.out.println("2. Add Edge");
            System.out.println("3. Display Graph");
            System.out.println("4. BFS Traversal");
            System.out.println("5. DFS Traversal");
            System.out.println("6. Back");

            choice =
                    getInteger("Enter choice: ");

            switch (choice) {

                case 1:

                    int vertex =
                            getInteger("Enter vertex: ");

                    graphManager.addVertex(vertex);

                    break;

                case 2:

                    int vertex1 =
                            getInteger(
                                    "Enter first vertex: "
                            );

                    int vertex2 =
                            getInteger(
                                    "Enter second vertex: "
                            );

                    graphManager.addEdge(
                            vertex1,
                            vertex2
                    );

                    break;

                case 3:

                    graphManager.displayGraph();

                    break;

                case 4:

                    int start =
                            getInteger(
                                    "Enter starting vertex: "
                            );

                    graphManager.bfs(start);

                    break;

                case 5:

                    start =
                            getInteger(
                                    "Enter starting vertex: "
                            );

                    graphManager.dfs(start);

                    break;

                case 6:
                    break;

                default:

                    System.out.println(
                            "Invalid choice."
                    );
            }

        } while (choice != 6);
    }

    // ================= PERFORMANCE =================

    static void performanceMenu() {

        int choice;

        do {

            System.out.println();
            System.out.println(
                    "--------- PERFORMANCE ---------"
            );

            System.out.println("1. Complexity");
            System.out.println("2. Search Performance");
            System.out.println("3. Back");

            choice =
                    getInteger("Enter choice: ");

            switch (choice) {

                case 1:

                    performanceManager
                            .displayComplexity();

                    break;

                case 2:

                    performanceManager
                            .compareSearching();

                    break;

                case 3:
                    break;

                default:

                    System.out.println(
                            "Invalid choice."
                    );
            }

        } while (choice != 3);
    }

    // ================= ALL RESULTS =================

    static void displayAllResults() {

        System.out.println();
        System.out.println(
                "============================================="
        );

        System.out.println(
                "             SYSTEM COMPONENTS"
        );

        System.out.println(
                "============================================="
        );

        System.out.println(
                "Array: Insert, Delete, Search, Display"
        );

        System.out.println(
                "Stack: Push, Pop, Peek, Display"
        );

        System.out.println(
                "Queue: Enqueue, Dequeue, Peek, Display"
        );

        System.out.println(
                "Linked List: Insert, Delete, Search, Display"
        );

        System.out.println(
                "Searching: Linear Search, Binary Search"
        );

        System.out.println(
                "Graph: Add Vertex, Add Edge, BFS, DFS"
        );

        System.out.println(
                "Performance: Complexity and Execution Time"
        );

        System.out.println(
                "============================================="
        );
    }
}