

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author NCRK (नवीन चौहान राजपूत खरदौनी)
 */
public class WaitImage extends JWindow{
    
    public WaitImage()
    {
        this.setOpacity(0.5f);
        this.setBounds(400,400,100,100);
        this.setBackground(Color.yellow);
        setLayout(null);
    }
    public void paint(Graphics g)
    {
        
    }
    public static void main(String[] a)
    {
        new WaitImage().setVisible(true);
    }
}
