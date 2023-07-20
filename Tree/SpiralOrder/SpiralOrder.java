package Tree.SpiralOrder;

import java.security.PublicKey;
import java.util.Deque;
import java.util.LinkedList;

public class SpiralOrder {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(70);

        tree.Spiral();
    }
}
class BTree{
    Node root;
    public void Spiral(){
        Deque<Integer> deque = new LinkedList<>();
    }
}
class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}
