package LinkedList.free;

import java.util.*;

public class  free {
    public static void main(String[] args) {

    }
}
class LinkedList {
    Node head = null;
    Node tail = null;
    public void insert(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node;
        }
    }
    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}