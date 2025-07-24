
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
                System.out.println(a.data + " ");
                a = a.next; 
            }
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