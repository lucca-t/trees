import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public class BSTFrame extends JFrame  {
    final int WIDTH=1440;
    final int HEIGHT=1024;
    public BSTFrame() //constructor
    {

        setSize (WIDTH, HEIGHT);
        setResizable(false);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("BS Tree");
        add(new BSTPanel());
    }

}
