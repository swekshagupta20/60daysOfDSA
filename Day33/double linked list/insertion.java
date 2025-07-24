public class insertion {

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

        // Add at end
        void add_end(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
        }

        // Add at start
        void add_start(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
        }

        // Add in middle at position `pos` (0-indexed)
        void add_middle(int val, int pos) {
            if (pos == 0) {
                add_start(val);
                return;
            }

            Node temp = new Node(val);
            Node current = head;
            int i = 0;

            while (i < pos - 1 && current != null) {
                current = current.next;
                i++;
            }

            if (current == null || current.next == null) {
                add_end(val);
            } else {
                temp.next = current.next;
                temp.prev = current;
                current.next.prev = temp;
                current.next = temp;
            }
        }

        // Print list forward
        void print() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.add_end(5);
        dll.add_end(6);
        dll.add_end(7);
        dll.add_end(8);

        dll.add_start(4);
        dll.add_middle(0, 3); // Insert at index 3

        // Print list
        System.out.println("Doubly Linked List:");
        dll.print();  // Output: 4 5 6 0 7 8
    }
}
