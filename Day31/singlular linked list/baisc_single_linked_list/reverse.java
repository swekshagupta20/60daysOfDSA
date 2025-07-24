public class reverse {
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


        void reverse(){
            Node prev = null;
            Node current = head; 
            Node nextNode; 
            tail = head; 

            while(current!=null){ // or temp3 != tail 
                nextNode = current.next; 
                current.next = prev; 
                prev = current; 
                current = nextNode;
            }
            head = prev; 
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

    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist(); // not the internal linked list, it is user defined 
        ll.add(4); // 4
        ll.add(5); // 4 5
        ll.add(6); // 4 5 6

        // prining list 
        System.out.println("Printing linked list: ");
        ll.display();
        System.out.println();

        System.out.println("printing reversed list: ");
        ll.reverse();
        ll.display();
        
    }

    
}
