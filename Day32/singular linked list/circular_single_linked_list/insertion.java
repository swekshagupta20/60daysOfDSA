
public class insertion{
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
            temp.next = head;
        }

        // adding element to the start of the list 
        void add_start(int val){
            Node temp = new Node(val); 

            if(head!=null){
                temp.next = head; 
                tail.next = temp; 
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
            int i = 0;

            // Traverse to pos-1 or until we loop back to head
            do {
                if (i == pos - 1) break;
                current = current.next;
                i++;
            } while (current != head);

            temp.next = current.next;
            current.next = temp;

            // If inserted at the end (just before head), update tail
            if (current == tail) {
            tail = temp; 
            }
        }

        void print(){
            Node a = head; 
            do {
                System.out.print(a.data + " ");
                a = a.next;
            } while (a != head);
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
        ll.print();

    }
}
