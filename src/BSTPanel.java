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
    JButton start = new JButton();
    public  BSTPanel(){

        setVisible(true);
        addMouseListener(this);

        startButon();
    }
    public void paint(Graphics g){
        g.setColor(new Color(0xE7E9EC));
        g.fillRect(0,0,getWidth(),getHeight());
        g.setColor(Color.black);
        g.fillRoundRect(100,10,100,100,10,10);
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