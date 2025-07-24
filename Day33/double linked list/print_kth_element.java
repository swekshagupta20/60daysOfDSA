public class print_kth_element {

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

        // Print k-th node from start (1-based)
        void print_kth_ele_start(int k) {
            System.out.print("K-th element from start (" + k + "): ");
            Node temp = head;
            int i = 1;
            while (i < k && temp != null) {
                temp = temp.next;
                i++;
            }
            if (temp != null)
                System.out.println(temp.data);
            else
                System.out.println("Position out of bounds");
        }

        // Print k-th node from end (1-based)
        void print_kth_ele_end(int k) {
            System.out.print("K-th element from end (" + k + "): ");
            Node temp = tail;
            int i = 1;
            while (i < k && temp != null) {
                temp = temp.prev;
                i++;
            }
            if (temp != null)
                System.out.println(temp.data);
            else
                System.out.println("Position out of bounds");
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList ll = new DoublyLinkedList();
        ll.add_end(5);
        ll.add_end(6);
        ll.add_end(7);
        ll.add_end(8);

        int k = 3;
        ll.print_kth_ele_start(k);
        ll.print_kth_ele_end(k);
    }
}
