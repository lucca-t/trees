import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private BinaryNode root;

    public BinarySearchTree()
    {
        root = null;
    }
    public void add(BinaryNode x)
    {
        if(root == null)
        {
            root = x;
            return;
        }
        add(root, x);
    }
    private void add(BinaryNode parent, BinaryNode x)
    {
        if(parent == null) return;
        if(x.getValue().compareTo(parent.getValue()) < 0)
            if(parent.left()==null)
                parent.setLeft(x);
            else
                add(parent.left(),x);
        else
        if(parent.right()==null)
            parent.setRight(x);
        else
            add(parent.right(),x);
    }
    public int compareTo(Object temp){

        return -1;
    }
    public String preOrder()
    {
        return preOrder(root).trim();
    }

    private String preOrder(BinaryNode k)
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
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            BinaryNode k = queue.poll();
            temp += k.getValue()+" ";
            if(k.left()!=null)
                queue.offer(k.left());
            if(k.right()!=null)
                queue.offer(k.right());
        }
        return temp.trim();
    }
    public int getHeight()
    {
        return getHeight(root);
    }

    private int getHeight(BinaryNode k)
    {
        if(k == null) return -1;
        return 1 + Math.max(getHeight(k.left()),
                getHeight(k.right()));
    }

    public BinaryNode remove(Comparable target)
    {
        if(root == null) return null;
        BinaryNode temp = root;
        BinaryNode inorderSuccessor;

        //check to see if root is to be removed
        if(root.getValue().equals(target))
        {
            //remove root degree 0
            if(root.left() == null && root.right() == null)
            {
                root = null;
                return temp;
            }
            //remove root degree 1 – right child
            else if(root.left() == null)
            {
                root = root.right();
                temp.setRight(null);;
                return temp;
            }
            //remove root degree 1 – left child
            else if(root.right() == null)
            {
                root = root.left();
                temp.setLeft(null);
                return temp;
            }
            //remove root degree 2
            {
                inorderSuccessor = successor(root);
                swap(root,inorderSuccessor);
                if(root.right()==inorderSuccessor)
                {
                    root.setRight(inorderSuccessor.right());
                    inorderSuccessor.setRight(null);
                    return inorderSuccessor;
                }
                return remove(root.right(),target);
            }

        }
        //if root is not removed call remove helper method
        return remove(root,target);
    }

    private BinaryNode successor(BinaryNode k)
    {
        BinaryNode temp = k;
        temp = temp.right();
        while(temp.left() != null)
            temp = temp.left();
        return temp;
    }
    private void swap(BinaryNode x, BinaryNode y)
    {
        Comparable k = (Comparable) x.getValue();
        x.setValue(y.getValue());
        y.setValue(k);
    }
    private BinaryNode search(BinaryNode parent, Comparable target)
    {
        if(parent == null) return null;
        if(parent.left()!=null && parent.left().getValue().equals(target)||
                parent.right()!=null && parent.right().getValue().equals(target))
            return parent;
        else if(target.compareTo(parent.getValue()) < 0)
            return search(parent.left(),target);
        else
            return search(parent.right(),target);
    }
    private BinaryNode remove(BinaryNode startNode, Comparable target)
    {
        BinaryNode nodeToRemove, inorderSuccessor;
        BinaryNode parent = search(startNode,target);

        if(parent == null) return null;

        //decide if it is a left or right child
        boolean isLeft = parent.left()!=null &&
                parent.left().getValue().equals(target);

        nodeToRemove = isLeft ? parent.left() : parent.right();

        //degree 0
        //degree 1
        //degree 2
    }
    private BinaryNode remove(BinaryNode startNode, Comparable target)
    {
        BinaryNode nodeToRemove, inorderSuccessor;
        BinaryNode parent = search(startNode,target);

        if(parent == null) return null;

        //decide if it is a left or right child
        boolean isLeft = parent.left()!=null &&
                parent.left().getValue().equals(target);

        nodeToRemove = isLeft ? parent.left() : parent.right();

        //degree 0
        //degree 1
        //degree 2
    }
    private BinaryNode remove(BinaryNode startNode, Comparable target)
    {
        BinaryNode nodeToRemove, inorderSuccessor;
        BinaryNode parent = search(startNode,target);

        if(parent == null) return null;

        //decide if it is a left or right child
        boolean isLeft = parent.left()!=null &&
                parent.left().getValue().equals(target);

        nodeToRemove = isLeft ? parent.left() : parent.right();

        //degree 0
        //degree 1
        //degree 2
    }




}
