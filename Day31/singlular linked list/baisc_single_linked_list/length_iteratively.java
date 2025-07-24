public class length_iteratively {
    public static class Node{
        int data;
        Node next; 

        Node(int data){ // constructor of Node 
            this.data = data; 
        }
    }

    public static int length(Node a){
        int count = 0; 
        while(a!=null){
            count++; 
            a = a.next; 
        }
        return count; 
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

        System.out.println("Printing length of the linked list: ");
        int len  = length(a);
        System.out.println(len);

        
        

    }
}
