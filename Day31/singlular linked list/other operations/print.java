

public class print {

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

        void print_first(){
            if(head!=null){
                System.out.println(head.data);
            }
            else{
                System.out.println("Empty list exists.");
            }
        }

        void print_last(){
            if(head!=null){
                System.out.println(tail.data);
            }
            else{
                System.out.println("Empty list exists.");
            }
        }

        void print_kth_ele_start(int pos){
            System.out.println("Printing kth element from start: ");

            // position is like index here if it is position then initialize i=1
            Node temp = head; 
            int i=1; 
            while(i!=pos){
                temp = temp.next; 
                i++; 
            }
            System.out.println(temp.data);
        }

        void print_kth_ele_end(int pos){
            System.out.println("printing kth element from end");
            Node temp = head; // counter 
            Node temp2 = head; // will print the element 
            int count = 0; 

            while(temp.next!=null){
                count++; 
                temp = temp.next;    
            }

            int idx = count-pos+1; 
            int i=0; 
            while(i!=idx){
                temp2 = temp2.next; 
                i++; 
            }
            System.out.println(temp2.data);   
        
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
        System.out.println();

        // printing first and last element 
        System.out.println("first and last elements are: ");
        ll.print_first();
        ll.print_last();
        System.out.println();

        int pos = 3; 
        ll.print_kth_ele_start(pos);
        System.out.println();

        ll.print_kth_ele_end(pos);

    }
    
}
