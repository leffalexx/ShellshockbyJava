package Homework_6;
import java.util.ArrayList;

public class Node {
    int num;
    public Node(int num) {
        this.num = num;
      }
    
      ArrayList<Node> children = new ArrayList<>();
    
      public void add(Node node) {
        children.add(node);
      }
}
