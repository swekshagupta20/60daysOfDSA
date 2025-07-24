public class print {

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

        // Add at end (circular)
        void add_end(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
                tail.next = head;
            } else {
                tail.next = temp;
                tail = temp;
                tail.next = head;
            }
        }

        // Add at start (circular)
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

        // Add at middle (pos = index)
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

        // Print entire list
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
        }

        // Print first node
        void print_first() {
            if (head != null) {
                System.out.println(head.data);
            } else {
                System.out.println("Empty list exists.");
            }
        }

        // Print last node
        void print_last() {
            if (tail != null) {
                System.out.println(tail.data);
            } else {
                System.out.println("Empty list exists.");
            }
        }

        // Print kth node from start (1-based index)
        void print_kth_ele_start(int pos) {
            System.out.println("Printing kth element from start: ");
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }

            Node temp = head;
            int i = 1;
            while (i < pos) {
                temp = temp.next;
                i++;
                if (temp == head) {
                    System.out.println("Position out of bounds.");
                    return;
                }
            }
            System.out.println(temp.data);
        }

        // Print kth node from end
        void print_kth_ele_end(int pos) {
            System.out.println("Printing kth element from end:");
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }

            // Count total nodes
            Node temp = head;
            int count = 1;
            while (temp.next != head) {
                count++;
                temp = temp.next;
            }

            int idx = count - pos + 1;
            if (idx <= 0) {
                System.out.println("Position out of bounds.");
                return;
            }

            Node temp2 = head;
            int i = 1;
            while (i < idx) {
                temp2 = temp2.next;
                i++;
            }
            System.out.println(temp2.data);
        }
    }

    public static void main(String[] args) {

        linkedlist ll = new linkedlist(); // user-defined circular linked list
        ll.add_end(5);
        ll.add_end(6);
        ll.add_end(7);
        ll.add_end(8);

        ll.add_start(4);
        ll.add_middle(0, 3); // pos = 3 means insert at index 3

        // Print list
        System.out.println("Printing list:");
        ll.print();
        System.out.println();

        // First and last elements
        System.out.println("First and last elements are:");
        ll.print_first();
        ll.print_last();
        System.out.println();

        int pos = 3;
        ll.print_kth_ele_start(pos);
        System.out.println();

        ll.print_kth_ele_end(pos);
    }
}
