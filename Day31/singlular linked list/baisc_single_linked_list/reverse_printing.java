// notice the difference in functions of both reverse and original string
// call stacks look similar but have differences 

public class reverse_printing {

    public static class Node{
        int data;
        Node next; 

        Node(int data){ // constructor of Node 
            this.data = data; 
        }
    }


    public static void reverse_list(Node a){
        // initially a is the head node 
        if(a == null) return; 

        reverse_list(a.next);
        System.out.print(a.data + " ");
    }

    public static void original_list(Node a){
        // initially a is the head node 
        if(a == null) return; 

        System.out.print(a.data + " ");
        reverse_list(a.next);
    }

    

    public static void main(String[] args) {
        // creating list first 

        Node a = new Node(5); // head node 
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);

        a.next = b; // 5-> 6
        b.next = c; // 5-> 6 -> 7
        c.next = d; // 5-> 6 -> 7 -> 8
        d.next = e; // 5-> 6 -> 7 -> 8 -> 9

        // original list 
        original_list(a);

        System.out.println();

        // reversed list 
        reverse_list(a);

    }
}
