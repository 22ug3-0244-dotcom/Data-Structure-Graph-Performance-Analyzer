public class LinkedListManager {

    private Node head;

    public void insert(int value) {

        Node newNode = new Node(value);

        if (head == null) {

            head = newNode;

        } else {

            Node current = head;

            while (current.next != null) {

                current = current.next;
            }

            current.next = newNode;
        }

        System.out.println("Value inserted successfully.");
    }

    public void delete(int value) {

        if (head == null) {

            System.out.println("Linked list is empty.");
            return;
        }

        if (head.data == value) {

            head = head.next;

            System.out.println("Value deleted successfully.");
            return;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.data == value) {

                current.next = current.next.next;

                System.out.println("Value deleted successfully.");
                return;
            }

            current = current.next;
        }

        System.out.println("Value not found.");
    }

    public void search(int value) {

        Node current = head;

        int position = 0;

        while (current != null) {

            if (current.data == value) {

                System.out.println(
                    "Value found at position " + position
                );

                return;
            }

            current = current.next;

            position++;
        }

        System.out.println("Value not found.");
    }

    public void display() {

        if (head == null) {

            System.out.println("Linked list is empty.");
            return;
        }

        Node current = head;

        System.out.println("Linked List:");

        while (current != null) {

            System.out.print(current.data + " -> ");

            current = current.next;
        }

        System.out.println("NULL");
    }
}