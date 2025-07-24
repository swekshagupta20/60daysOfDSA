// starting and ending node for circular linked list while deletion is same 

public class deletion {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        // Add at end
        void add_end(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
                tail.next = head;
            } else {
                tail.next = temp;
                tail = temp;
                tail.next = head;
            }
        }

        // Add at start
        void add_start(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
                tail.next = head;
            } else {
                temp.next = head;
                head = temp;
                tail.next = head;
            }
        }

        // Add in middle at index pos (0-based)
        void add_middle(int val, int pos) {
            if (pos == 0) {
                add_start(val);
                return;
            }

            Node temp = new Node(val);
            Node current = head;
            int i = 0;

            while (i != pos - 1) {
                current = current.next;
                i++;
                if (current == head) {
                    System.out.println("Position out of bounds.");
                    return;
                }
            }

            temp.next = current.next;
            current.next = temp;

            if (current == tail) {
                tail = temp;
            }
        }

        // Print circular list
        void print() {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }

            Node a = head;
            do {
                System.out.print(a.data + " ");
                a = a.next;
            } while (a != head);
            System.out.println();
        }

        // Delete from start
        void delete_start() {
            if (head == null) return;

            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
        }

        // Delete from end
        void delete_end() {
            if (head == null) return;

            if (head == tail) {
                head = tail = null;
            } else {
                Node temp = head;
                while (temp.next != tail) {
                    temp = temp.next;
                }
                temp.next = head;
                tail = temp;
            }
        }

        // Delete from middle at position pos (0-based)
        void delete_middle(int pos) {
            if (head == null) return;

            if (pos == 0) {
                delete_start();
                return;
            }

            Node temp = head;
            int i = 0;

            while (i != pos - 1) {
                temp = temp.next;
                i++;
                if (temp.next == head) {
                    System.out.println("Position out of bounds.");
                    return;
                }
            }

            Node toDelete = temp.next;
            temp.next = toDelete.next;

            if (toDelete == tail) {
                tail = temp;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();

        ll.add_end(5);
        ll.add_end(6);
        ll.add_end(7);
        ll.add_end(8);

        ll.add_start(4);
        ll.add_middle(0, 3);  // insert 0 at index 3

        System.out.println("Printing the list:");
        ll.print();

        // delete first node
        ll.delete_start();
        System.out.println("List after deletion of first node:");
        ll.print();

        // delete last node
        ll.delete_end();
        System.out.println("List after deletion of last node:");
        ll.print();

        // delete node at pos 1
        ll.delete_middle(1);
        System.out.println("List after deletion of node at pos 1:");
        ll.print();
    }
}

