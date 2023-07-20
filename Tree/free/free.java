package Tree.free;
import java.util.*;

public class free {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.root = new Node(3);
        tree.root.left = new Node(9);
        tree.root.right = new Node(20);
        tree.root.right.left = new Node(15);
//        tree.root.right.left.left = new Node(20);
//        tree.root.right.left.right = new Node(25);
        tree.root.right.right = new Node(7);

    }
}
class BTree{
    Node root;
}
class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }

}

