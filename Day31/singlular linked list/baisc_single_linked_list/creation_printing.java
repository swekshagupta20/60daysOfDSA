// contains different ways to create and print linked list 

public class creation_printing {

    public static class Node{
        int data;
        Node next; 

        Node(int data){ // constructor of Node 
            this.data = data; 
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5); // head node 
        // System.out.println(a.next); // here it is NULL 
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);

        a.next = b; // 5-> 6
        //System.out.println(a.next);  // here address is updated
        b.next = c; // 5-> 6 -> 7
        c.next = d; // 5-> 6 -> 7 -> 8
        d.next = e; // 5-> 6 -> 7 -> 8 -> 9


        // one way to print linked list 
        // but this method prints data in a form such as in array we use indexes to print values directly 
        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);
        System.out.println(d.data);
        System.out.println(e.data);
        System.out.println();

        // another way 
        System.out.println(a.data);
        System.out.println(a.next.data); // prints data of b
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data); //prints data of e
        System.out.println();

        // can generalise it to for loop 
        Node temp = a; //object of type Node pointing towards  node a

        for(int i=1; i<=5; i++){
            System.out.print(temp.data+ " ");
            temp = temp.next; 
        }
        System.out.println();

        // if we do not know the exact number of iterations we use while loop
        temp = a; 

        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.next; 
        }


    }
    
}
