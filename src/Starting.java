import java.awt.*;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author NCRK (नवीन चौहान राजपूत खरदौनी)
 */
public class Starting extends JWindow implements Runnable {
    private JLabel    ime;
    String            n, c, r, k;
    String            name;
    private JPanel    panel;
    int               pattern;
    private Dimension screensize;
    private JLabel    splashImage;
    JTextField        t;
    Thread            th;

    public Starting() {
        splashImage = new JLabel(new ImageIcon(getClass().getResource("Images/3.jpg")));
        n           = "नवीन";
        c           = "चौहान";
        r           = "राजपूत";
        k           = "खरदौनी";
        t           = new JTextField(n + c + r + k);
        pattern     = 1;

        // getContentPane().add(splashImage, BorderLayout.CENTER);
        // getContentPane().add(t,BorderLayout.CENTER);
        // pack();
        setSize(340, 280);
        setLayout(null);
        add(splashImage);
        add(t);
        splashImage.setBounds(0, 0, 340, 220);
        t.setBounds(0, 221, 340, 60);
        t.setFont(new Font(null, 2, 30));
        t.setForeground(Color.red);
        screensize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screensize.width / 2) - (getSize().width / 2), (screensize.height / 2) - (getSize().height / 2));
        splashImage.setBorder(BorderFactory.createLineBorder(new Color(75, 75, 75)));
        t.setFocusable(false);
        t.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        th = new Thread(this);
        th.start();
    }

    public void run() {
        while (true) {
            switch (pattern) {
            case 1 :
                name    = c + " " + r + " " + k + " " + n;
                pattern = 2;
                t.setBackground(Color.pink);
                break;

            case 2 :
                name    = r + " " + k + " " + n + " " + c;
                pattern = 3;
                t.setBackground(Color.green);
                break;

            case 3 :
                name    = k + " " + n + " " + c + " " + r;
                pattern = 4;
                t.setBackground(Color.blue);
                break;

            case 4 :
                name    = n + " " + c + " " + r + " " + k;
                pattern = 1;
                t.setBackground(Color.white);
                break;
            }

            t.setText(name);

            try {
                th.sleep(1000);
            } catch (Exception e) {}
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
