public class concept {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        // Step 1: Create Nodes
        Node a = new Node(5);  // head
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);

        // Step 2: Link nodes to make it circular
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = a;  // circular connection

        // Direct access printing
        System.out.println("Direct access:");
        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);
        System.out.println(d.data);
        System.out.println(e.data);
        System.out.println();

        // Access via chaining
        System.out.println("Chained access:");
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);
        System.out.println();

        // For loop (fixed size)
        System.out.println("For loop printing (5 iterations):");
        Node temp = a;
        for (int i = 1; i <= 5; i++) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

        // While loop using circular check (do-while)
        System.out.println("Circular While loop (using do-while):");
        temp = a;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != a);
    }
}
