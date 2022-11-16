package Homework_5;

import java.util.ArrayList;

class Node {
    
    int num;
    ArrayList<Node> children = new ArrayList<>();
    Node(int num) {
        this.num = num;
    }
}
class Solution{
    void tree(Node node) {
        if(node.children.size() < 1)
            return;
        for (int i = 0; i < node.children.size(); i++) {
            tree(node.children.get(i));
        }
    }
    public static void main(String[] args) {
        
    }
}