package LinkedList.linkedlist5;

public class linkedlist {
    public static void main(String[] args) {
        Node node = new Node(1);
        Node head = node;
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
    }

}
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
