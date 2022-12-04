package Homework_6;
import java.util.ArrayList;

class Node {
    int num;
    public Node(int num) {
        this.num = num;
      }
    
      ArrayList<Node> children = new ArrayList<>();
    
      public void add(Node node) {
        children.add(node);
      }
}

public class tree {
    public static void main(String[] args) {
    Node n1 = new Node(1);

    Node n2 = new Node(2);
    Node n3 = new Node(3);

    Node n4 = new Node(4);
    Node n5 = new Node(5);
    Node n6 = new Node(6);

    Node n7 = new Node(7);
    Node n8 = new Node(8);
    Node n9 = new Node(9);
    Node n11 = new Node(11);
    Node n20 = new Node(20);

    n1.add(n2);
    n1.add(n3);
    n1.add(new Node(34));
    n1.add(new Node(341));
    n1.add(new Node(342));

    n2.add(n4);
    n4.add(n7);
    n4.add(n8);
    n4.add(n9);

    n3.add(n5);
    n3.add(n6);
    n6.add(n11);
    n6.add(n20);

    preOrder(n1);
    }

    public static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.num);
            if (root.children.size() != 0) System.out.print(" (");
            for (int i = 0; i < root.children.size(); i++) {
                preOrder(root.children.get(i));
                if (i == root.children.size() - 1) System.out.print(")");
                else System.out.print(" ");
            }
        }
    }
    
}
