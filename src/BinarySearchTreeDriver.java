public class BinarySearchTreeDriver
{
    public static void main(String args[])
    {
        BinarySearchTree tree = new BinarySearchTree();

        String str = "7 27 11 3 14 12 26 41 19 35 4 50";
        String[] list = str.split(" ");

        for(String k:list)
            tree.add(new BinaryNode(Integer.parseInt(k)));
    }
}
