// amother yet effective implementation of linked list using user defined datatypes 

public class new_implementation {
    
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

        // insertion function 
        void add(int val){
            // make new node 
            Node temp = new Node(val);
            if(head == null){
                head = temp; 
            }
            else{
                tail.next = temp;    
            }
            tail = temp;   
        }


        // display function 
        void display(){
            Node a = head;  // made this to ensure our linked list exists 
            // dont want head to be null thats why we use Node a = head 
            while(a != null){
                 System.out.print(a.data + " ");
                 a = a.next; 
            }
        }

        // printing size of linked list 
        int size(){
            Node b = head; 
            int count = 0; 
            while(b!=null){
                count++;
                b = b.next; 
            }
            return count; 
        }

        
    }

    public static void main(String[] args) {

        linkedlist ll = new linkedlist(); // not the internal linked list, it is user defined 
        ll.add(4); // 4
        ll.add(5); // 4 5
        ll.add(6); // 4 5 6

        // prining list 
        System.out.println("Printing linked list: ");
        ll.display();

        // printing size of list 
        System.out.println("Printing size: ");
        int len = ll.size();
        System.out.println(len);
        
    }
}
