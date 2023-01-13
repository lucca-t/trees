public class BinaryNode {
    private BinaryNode left, right;
    private Comparable myValue;

    public BinaryNode(Comparable x){
        right= null;
        left= null;
        myValue=x;

    }
    public String toString()
    {
        String temp = "Value:"+myValue+
                ", Left:"+(left==null?null:left.myValue)+
                ", Right:"+(right==null?null:right.myValue);
        return temp;
    }

    public BinaryNode right() {
        return right;
    }

    public Object getValue() {
        return myValue;
    }

    public BinaryNode left() {
        return left;
    }

    public void setLeft(BinaryNode x) {
        left=x;
    }

    public void setRight(BinaryNode x) {
        right=x;
    }

    public void setValue(Object value) {
        myValue.equals(value);
    }

    //other methods not shown.
}
