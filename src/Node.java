import java.util.Scanner;

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }
    public Node left(){
        return left;
    }
    public Node right(){
        return right;
    }
    public int getValue(){
        return value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public String toString(){
        return "Value is "+value+"left: "+left.getValue()+" right: "+right.getValue();

    }
}
