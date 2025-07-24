public class basics {
    public static class Node{
        int data;
        Node prev; 
        Node next; 

        Node(int data){
            this.data=data; 
        }
    }

    // printing full list from left to right 
    public static void display(Node head){
        Node temp = head; 
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.next; 
        }
    }

    // printing whole list in reverse order 
    public static void display_reverse(Node tail){
        Node temp = tail; 
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.prev; 
        }
    }

    // printing whole list if random node is given 
    public static void display_node_random(Node random){
        Node temp = random; 
        while(temp.prev!=null){
            temp = temp.prev; 
        }
        display(temp);
    }


    public static void main(String[] args) {
        
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(6);
        Node d = new Node(5);
        Node e = new Node(4);
        
        a.next = b;
        b.prev = a; 
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e; 
        e.prev = d;

        //printing the list 
        System.out.println("Printing the list: ");
        display(a);
        System.out.println();

        // printing in reverse order 
        System.out.println("Printing list in reverse order: ");
        display_reverse(e);
        System.out.println();

        //printing whole list if random node is given 
        System.out.println("random: ");
        display_node_random(c);
    }
}
