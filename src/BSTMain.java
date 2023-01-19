import java.util.Scanner;

public class BSTMain {
    public static void main(String args[]) {
        /*BinarySearchTree tree = new BinarySearchTree();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number (or 'q' to quit): ");
            String line = scanner.nextLine();
            if (line.equals("q")) {
                break;
            }
            try {
                int value = Integer.parseInt(line);
                tree.addTo(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
            }

        }
        System.out.println("preOrder " + tree.preOrder());
        System.out.println("inOrder " + tree.inOrder());
        System.out.println("levelOrder " + tree.levelOrder());*/
        new BSTFrame();
    }
}
