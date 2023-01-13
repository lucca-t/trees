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
        start = new JButton();
        add(start);
        start.setText("Start Game");
        start.setFocusable(false);
        start.addActionListener(this);
        setVisible(true);
        addMouseListener(this);
        start.setEnabled(true);

        setBackground(new Color(0xFFD9C4A0, true));
    }
    public void paint(Graphics g){
        g.setColor(new Color(0xFFD9C4A0, true));
        g.drawRect(0,0,getWidth(),getHeight());
    }

    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void actionPerformed(ActionEvent e){}
}