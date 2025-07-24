public class reverse_circular_doubly_linkedList {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static class CircularDoublyLinkedList {
        Node head = null;
        Node tail = null;

        // Add to end
        void add_end(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
                head.next = head;
                head.prev = head;
            } else {
                tail.next = temp;
                temp.prev = tail;
                temp.next = head;
                head.prev = temp;
                tail = temp;
            }
        }

        // Print forward
        void print_forward() {
            if (head == null) return;

            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }

        // Print reverse
        void print_reverse() {
            if (tail == null) return;

            Node temp = tail;
            do {
                System.out.print(temp.data + " ");
                temp = temp.prev;
            } while (temp != tail);
            System.out.println();
        }

        // Reverse the circular doubly linked list
        void reverse() {
            if (head == null || head.next == head) return;

            Node current = head;
            do {
                Node temp = current.next;
                current.next = current.prev;
                current.prev = temp;

                current = temp;
            } while (current != head);

            // Swap head and tail
            Node tempHead = head;
            head = tail;
            tail = tempHead;
        }
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();

        cdll.add_end(10);
        cdll.add_end(20);
        cdll.add_end(30);
        cdll.add_end(40);

        System.out.println("Original list (forward):");
        cdll.print_forward();

        System.out.println("Original list (reverse):");
        cdll.print_reverse();

        cdll.reverse();

        System.out.println("After reverse (forward):");
        cdll.print_forward();

        System.out.println("After reverse (reverse):");
        cdll.print_reverse();
    }
}
