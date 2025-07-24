public class all_basic_operations {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static class CDLL {
        Node head = null;
        Node tail = null;

        // Add at end
        void add_end(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
                temp.next = temp.prev = temp;
            } else {
                tail.next = temp;
                temp.prev = tail;
                temp.next = head;
                head.prev = temp;
                tail = temp;
            }
        }

        // Add at start
        void add_start(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
                temp.next = temp.prev = temp;
            } else {
                temp.next = head;
                temp.prev = tail;
                head.prev = temp;
                tail.next = temp;
                head = temp;
            }
        }

        // Add in middle at given position (0-based index)
        void add_middle(int val, int pos) {
            if (pos == 0) {
                add_start(val);
                return;
            }

            Node temp = new Node(val);
            Node current = head;
            int i = 0;

            while (i < pos - 1 && current.next != head) {
                current = current.next;
                i++;
            }

            Node nextNode = current.next;

            current.next = temp;
            temp.prev = current;

            temp.next = nextNode;
            nextNode.prev = temp;

            if (current == tail) {
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
                head.prev = tail;
                tail.next = head;
            }
        }

        // Delete from end
        void delete_end() {
            if (head == null) return;

            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
            }
        }

        // Delete from middle at given position
        void delete_middle(int pos) {
            if (head == null) return;

            if (pos == 0) {
                delete_start();
                return;
            }

            Node current = head;
            int i = 0;

            while (i < pos && current.next != head) {
                current = current.next;
                i++;
            }

            Node prevNode = current.prev;
            Node nextNode = current.next;

            prevNode.next = nextNode;
            nextNode.prev = prevNode;

            if (current == tail) {
                tail = prevNode;
            }
        }

        // Print forward
        void print_forward() {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }

            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }

        // Print reverse (without reversing the list)
        void print_reverse() {
            if (tail == null) {
                System.out.println("List is empty.");
                return;
            }

            Node temp = tail;
            do {
                System.out.print(temp.data + " ");
                temp = temp.prev;
            } while (temp != tail);
            System.out.println();
        }

        // Print from any node (forward)
        void print_from_node(Node node) {
            if (node == null) {
                System.out.println("Node is null.");
                return;
            }

            Node temp = node;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != node);
            System.out.println();
        }

        // Get k-th node from start (1-based index)
        void print_kth_from_start(int k) {
            if (head == null || k <= 0) {
                System.out.println("Invalid position.");
                return;
            }

            Node temp = head;
            int i = 1;
            while (i < k) {
                temp = temp.next;
                if (temp == head) {
                    System.out.println("Position out of bounds.");
                    return;
                }
                i++;
            }

            System.out.println("K-th from start: " + temp.data);
        }

        // Get k-th node from end (1-based index)
        void print_kth_from_end(int k) {
            if (tail == null || k <= 0) {
                System.out.println("Invalid position.");
                return;
            }

            Node temp = tail;
            int i = 1;
            while (i < k) {
                temp = temp.prev;
                if (temp == tail) {
                    System.out.println("Position out of bounds.");
                    return;
                }
                i++;
            }

            System.out.println("K-th from end: " + temp.data);
        }

        // Get node by index (0-based) for print_from_node()
        Node get_node(int pos) {
            if (head == null) return null;

            Node temp = head;
            int i = 0;
            while (i < pos && temp.next != head) {
                temp = temp.next;
                i++;
            }
            return temp;
        }
    }

    public static void main(String[] args) {
        CDLL list = new CDLL();

        list.add_end(10);
        list.add_end(20);
        list.add_end(30);
        list.add_start(5);
        list.add_middle(15, 2);  // Insert 15 at index 2

        System.out.println("Print forward:");
        list.print_forward();

        System.out.println("Print reverse:");
        list.print_reverse();

        System.out.println("Print from node at position 1:");
        Node any = list.get_node(1);
        list.print_from_node(any);

        System.out.println("K-th from start (3):");
        list.print_kth_from_start(3);

        System.out.println("K-th from end (2):");
        list.print_kth_from_end(2);

        list.delete_start();
        System.out.println("After deleting from start:");
        list.print_forward();

        list.delete_end();
        System.out.println("After deleting from end:");
        list.print_forward();

        list.delete_middle(1);
        System.out.println("After deleting at position 1:");
        list.print_forward();
    }
}
