public class deletion {

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


        
        // Delete from start
        void delete_start() {
            if (head == null) return;

            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev.next = null;
                head.prev = null;
            }
        }

        // Delete from end
        void delete_end() {
            if (tail == null) return;

            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next.prev = null;
                tail.next = null;
            }
        }

        // Delete from middle at position (0-indexed)
        void delete_middle(int pos) {
            if (pos == 0) {
                delete_start();
                return;
            }

            Node current = head;
            int i = 0;
            while (i < pos && current != null) {
                current = current.next;
                i++;
            }

            if (current == null || current == tail) {
                delete_end();
                return;
            }

            current.prev.next = current.next;
            current.next.prev = current.prev;
            current.next = null;
            current.prev = null;
        }

        // Print list forward
        void print() {
            Node a = head;
            while (a != null) {
                System.out.print(a.data + " ");
                a = a.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList ll = new DoublyLinkedList();

        ll.add_end(5);
        ll.add_end(6);
        ll.add_end(7);
        ll.add_end(8);


        System.out.println("Printing the list:");
        ll.print();

        ll.delete_start();
        System.out.println("List after deletion of first node:");
        ll.print();

        ll.delete_end();
        System.out.println("List after deletion of last node:");
        ll.print();

        ll.delete_middle(1);
        System.out.println("List after deletion of node at pos 1:");
        ll.print();
    }
}
