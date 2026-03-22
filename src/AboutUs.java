import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author NCRK (नवीन चौहान राजपूत खरदौनी)
 */
public class AboutUs extends JDialog {
    
    AboutUs(JFrame f)
    {
        super(f, "About us", true);
        this.setResizable(false);
        this.setBounds(200, 100, 600, 500);
        this.setLayout(null);

        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();

        setLocation((screensize.width / 2) - (getSize().width / 2), (screensize.height / 2) - (getSize().height / 2));

        JLabel l = new JLabel("ॐ नम: शिवाय !", JLabel.CENTER);
        this.add(l);
        l.setForeground(Color.red);
        l.setFont(new Font(null, 2, 30));
        l.setBounds(0, 20, 500, 50);
        l.setBackground(Color.green);

        JLabel l1 = new JLabel("Developed by : ", JLabel.RIGHT);
        l1.setBounds(0, 100, 200, 30);
        this.add(l1);

        JLabel l2 = new JLabel("NCRK (नवीन चौहान राजपूत खरदौनी)");
        l2.setBounds(200, 100, 350, 30);
        l2.setFont(new Font(null, 1, 20));
        this.add(l2);

        JLabel l3 = new JLabel("e-Mail : ", JLabel.RIGHT);
        l3.setBounds(0, 150, 200, 30);
        this.add(l3);

        JLabel l4 = new JLabel(" ncrkrajput@programmer.net  ");
        l4.setFont(new Font(null, 1, 15));
        l4.setBounds(200, 150, 400, 30);
        this.add(l4);

        JLabel l4_ = new JLabel(" ncrkrajput@engineer.com ");
        l4_.setFont(new Font(null, 1, 15));
        l4_.setBounds(200, 185, 400, 30);
        this.add(l4_);

        JLabel l5 = new JLabel("Software : ", JLabel.RIGHT);
        l5.setBounds(0, 220, 200, 30);
        this.add(l5);

        JLabel l6 = new JLabel("NCRK :: TextEditor ");
        l6.setFont(new Font(null, 1, 18));
        l6.setBounds(200, 220, 200, 30);
        this.add(l6);

        JLabel l7 = new JLabel("Version : ", JLabel.RIGHT);
        l7.setBounds(0, 270, 200, 30);
        this.add(l7);

        JLabel l8 = new JLabel("v1.0.0  ");
        l8.setFont(new Font(null, 1, 15));
        l8.setBounds(200, 270, 100, 30);
        this.add(l8);

        JLabel l9 = new JLabel("visit at (free source code) : ", JLabel.RIGHT);
        l9.setBounds(0, 320, 200, 30);
        this.add(l9);

        JLabel l10 = new JLabel("SourceForge.net/NCRKrajput ");
        l10.setFont(new Font(null, 1, 15));
        l10.setBounds(200, 320, 400, 30);
        this.add(l10);
        
        JLabel l11 = new JLabel("Release Date: ", JLabel.RIGHT);
        l11.setBounds(0, 370, 200, 30);
        this.add(l11);
        
        JLabel l12 = new JLabel("Friday January 1, 2016");
        l12.setFont(new Font(null, 1, 15));
        l12.setBounds(200, 370, 400, 30);
        this.add(l12);
        
        this.setVisible(true);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
