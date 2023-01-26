import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
public class BSTPanel extends JPanel implements MouseListener, ActionListener {
    BinarySearchTree tree;
    public  BSTPanel(){

        setVisible(true);
        addMouseListener(this);
        tree=new BinarySearchTree();

    }
    public void paint(Graphics g){
        /*g.setColor(new Color(0xE7E9EC));
        g.fillRect(0,0,getWidth(),getHeight());*/
        g.setColor(new Color(0xCCCCCC));
        g.drawLine(720,0,720,10);
        //level 1
        g.fillOval(705,20,30,30);
        //level 2
        g.fillOval(345,100,30,30);
        g.fillOval(1065,100,30,30);
        //level3
        g.fillOval(165,180,30,30);
        g.fillOval(525,180,30,30);

        g.fillOval(885,180,30,30);
        g.fillOval(1245,180,30,30);
        //level 4
        g.fillOval(75,260,30,30);
        g.fillOval(255,260,30,30);
        g.fillOval(435,260,30,30);
        g.fillOval(615,260,30,30);

        g.fillOval(795,260,30,30);
        g.fillOval(975,260,30,30);
        g.fillOval(1155,260,30,30);
        g.fillOval(1335,260,30,30);
        //level 5
        g.fillOval(30,340,30,30);
        g.fillOval(120,340,30,30);
        g.fillOval(210,340,30,30);
        g.fillOval(300,340,30,30);

        g.fillOval(390,340,30,30);
        g.fillOval(480,340,30,30);
        g.fillOval(570,340,30,30);
        g.fillOval(660,340,30,30);

        g.fillOval(750,340,30,30);
        g.fillOval(840,340,30,30);
        g.fillOval(930,340,30,30);
        g.fillOval(1020,340,30,30);

        g.fillOval(1110,340,30,30);
        g.fillOval(1200,340,30,30);
        g.fillOval(1290,340,30,30);
        g.fillOval(1380,340,30,30);
    }

    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseClicked(MouseEvent e){
        int x = e.getX();
        int y = e.getY();
        System.out.println("oc is (" + x + "," + y + ")");
    }
    public void actionPerformed(ActionEvent e){}
    /*public void startButon(){
        start = new JButton();
        add(start);
        start.setText("Start Game");
        start.setFocusable(false);
        start.addActionListener(this);
        start.setEnabled(true);
    }*/
}