public class implementation {

    // Doubly linked list node
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static class DoublyLinkedList {
        Node head = null;
        Node tail = null;

        // Insertion at end
        void add(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
        }

        // Display forward
        void displayForward() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }

        // Display backward
        void displayBackward() {
            Node curr = tail;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.prev;
            }
            System.out.println();
        }

        // Size of list
        int size() {
            int count = 0;
            Node curr = head;
            while (curr != null) {
                count++;
                curr = curr.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add(4);
        dll.add(5);
        dll.add(6);

        System.out.println("Printing linked list forward:");
        dll.displayForward();  // Output: 4 5 6

        System.out.println("Printing linked list backward:");
        dll.displayBackward();  // Output: 6 5 4

        System.out.println("Size of the list:");
        System.out.println(dll.size());  // Output: 3
    }
}
