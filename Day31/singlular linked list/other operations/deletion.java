
public class deletion{
    public static class Node{
        int data;
        Node next; 

        Node(int data){
            this.data = data; 
        }
    }

    public static class linkedlist{

        Node head = null; 
        Node tail = null; 

        // adding element in the end of the list 
        void add_end(int val){

            Node temp = new Node(val);
            if(head==null){ // checking if head is null
                head = temp; 
            }
            else{
                tail.next = temp; 
            }
            tail = temp; 
        }

        // adding element to the start of the list 
        void add_start(int val){
            Node temp = new Node(val); 

            if(head!=null){
                temp.next = head; 
                head = temp; 
            }
            // if head is null 
            else{
                head = temp; 
                tail = temp; 
            }
        }

        // adding element in middle at place x
        void add_middle(int val, int pos){
            Node temp = new Node(val); 
            Node current = head; 
            int i=0; 
            while( i!=pos-1){
                current = current.next; 
                i++;
            }
            temp.next = current.next; 
            current.next = temp; 
        }

        void print(){
            Node a = head; 
            while(a!=null){
                System.out.print(a.data + " ");
                a = a.next; 
            }
        }

        //deleting from start 
        void delete_start(){
            Node temp = head;
            head = head.next; 
            temp.next = null; 
        }

        //deleting from end 
        void delete_end(){
            Node temp = head; 
            while(temp.next.next!=null){
                temp = temp.next; // will traverse till second last node 
            }
            tail = temp; 
            temp.next = null;
        }

        // deleting from middle at position pos
        void delete_middle(int pos){
            Node temp = head; 
            int i=0;
            while(i!=pos-1){
                temp = temp.next; 
                i++;
            }
            temp.next = temp.next.next; 
        }

        
    }



    public static void main(String[] args) {
        
        linkedlist ll = new linkedlist(); // object of linkedlist class 
        ll.add_end(5);
        ll.add_end(6); 
        ll.add_end(7);
        ll.add_end(8); 

        ll.add_start(4);
        ll.add_middle(0,3);  // pos =3 means index 3 not placement at 3

        // printing list 
        System.out.println("printing the list: ");
        ll.print();
        System.out.println();

        // deleting first node 
        ll.delete_start(); 
        System.out.println("list after deletion of first node: ");
        ll.print();
        System.out.println();

        // deleting last node 
        ll.delete_end();
        System.out.println("list after deletion of last node: ");
        ll.print();
        System.out.println();

        // deleting middle node 
        ll.delete_middle(1);
        System.out.println("list after deletion of node at pos: ");
        ll.print();
        
        

    }
}
