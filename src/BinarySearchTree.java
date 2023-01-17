import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class BinarySearchTree {
    Node root;

    public void addTo(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists in the tree
            return current;
        }

        return current;
    }
    public String preOrder()
    {
        return preOrder(root).trim();
    }

    private String preOrder(Node k)
    {
        String temp = "";
        if(k != null)
        {
            // use value
            temp += k.getValue()+ " ";
            // go left
            temp += preOrder(k.left());
            // go right
            temp += preOrder(k.right());
        }
        return temp;
    }
    public String levelOrder()
    {
        String temp = "";
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            Node k = queue.poll();
            temp += k.getValue()+" ";
            if(k.left()!=null)
                queue.offer(k.left());
            if(k.right()!=null)
                queue.offer(k.right());
        }
        return temp.trim();
    }
    public String inOrder(){
        String balls="";
        String[]temp=this.preOrder().split(" ");
        int[]arr=new int[temp.length];
        for(int i=0; i<temp.length; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }
        Arrays.sort(arr);
        for(int x=0;x<arr.length;x++){
            balls+=arr[x]+" ";
        }
        return balls;
    }






}
