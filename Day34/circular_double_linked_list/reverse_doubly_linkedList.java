public class reverse_doubly_linkedList {

    // Node class
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    // Doubly Linked List class
    public static class DoublyLinkedList {
        Node head = null;
        Node tail = null;

        // Add to end
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

        // Print forward
        void print_forward() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Print reverse
        void print_reverse() {
            Node temp = tail;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.prev;
            }
            System.out.println();
        }

        // Reverse the doubly linked list from head
        // if we reverse from tail, we would use current = current.next after swapping 
        // then we would update tail first then traverse for head 
        void reverse() {
            Node current = head;
            Node temp = null;

            while (current != null) {
                // Swap prev and next
                temp = current.prev;
                current.prev = current.next;
                current.next = temp;

                current = current.prev; // move to next node (was previous)
            }


            if (temp != null) {
                head = temp.prev;
            }
            
            // updating tail by traversing till last 
            tail = head;
            while (tail != null && tail.next != null) {
                tail = tail.next;
            }
        }    
    }

    // Main method
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.add_end(10);
        dll.add_end(20);
        dll.add_end(30);
        dll.add_end(40);

        System.out.println("Original list (forward):");
        dll.print_forward();

        dll.reverse();

        System.out.println("Reversed list (forward):");
        dll.print_forward();

        System.out.println("Reversed list (reverse print):");
        dll.print_reverse();

        
    }
}
