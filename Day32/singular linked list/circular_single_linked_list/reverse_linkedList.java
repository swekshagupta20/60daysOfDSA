
public class reverse_linkedList{
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

        void reverse_circular(){

            Node prev = null;
            Node current = head; 
            Node nextNode; 

            do { 
                nextNode = current.next;
                current.next = prev; 
                prev = current; 
                current = nextNode;
            } while (current!=head);

            tail = head;
            head = prev; 
            tail.next = head; // circlular link 

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

        // printing list 
        ll.print();

        //reversing a list 
        System.out.println("Printing reverse of circular list: ");
        ll.reverse_circular();
        ll.print();


    }
}
