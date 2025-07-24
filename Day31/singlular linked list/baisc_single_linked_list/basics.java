// making list using user defined datatype i.e. Node class 

public class basics{

    public static class Node{
        int data; // stored data
        Node next; // stores address of next node 
    }
    public static void main(String[] args) {

        Node x = new Node(); // object of class node 
        
        System.out.println(x.data); // default->0
        System.out.println(x.next); // default->NULL


        System.out.println(x); //System.out.println(x); prints something like basics$Node@hashcode 
        //because x is an object and Java uses the default toString() from Object, which shows the class name and memory hash.

    }
}