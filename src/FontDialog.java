import java.awt.*;
import java.awt.Choice;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author NCRK (नवीन चौहान राजपूत खरदौनी)
 */
class FontDialog extends JDialog {
    private Choice  ch1 = new Choice();
    private Choice  ch2 = new Choice();
    private Choice  ch3 = new Choice();
    private JButton b1  = new JButton("OK");
    private Font    fnt;
    private JFrame1 outer;

    FontDialog(final JFrame1 outer) {
        super(outer, "Choose Font", true);
        this.outer = outer;
        setSize(350, 200);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setTitle("Choose Font Style and Size");

        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();

        setLocation((screensize.width / 2) - (getSize().width / 2), (screensize.height / 2) - (getSize().height / 2));
        setLayout(null);
        ch1.setBounds(50, 50, 150, 25);
        add(ch1);
        ch2.setBounds(50, 90, 150, 25);
        add(ch2);
        ch3.setBounds(50, 130, 150, 25);
        add(ch3);
        b1.setBounds(220, 50, 100, 25);
        add(b1);
        ch2.add("Plain");
        ch2.add("Bold");
        ch2.add("Italic");

        for (int i = 10; i <= 72; i += 2) {
            ch3.add(i + "");
        }

        ch3.setName("Size");

        GraphicsEnvironment ge  = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[]            arr = ge.getAvailableFontFamilyNames();

        for (String item : arr) {
            ch1.add(item);
        }

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b1_Click(e);
            }
        });

        // ch1.addItemListener(new ItemListener(){public void itemStateChanged(ItemEvent e){changefont(e);}});
        // ch2.addItemListener(new ItemListener(){public void itemStateChanged(ItemEvent e){changefont(e);}});
        // ch3.addItemListener(new ItemListener(){public void itemStateChanged(ItemEvent e){changefont(e);}});
    }

    void changefont() {
        String nm    = getCh1().getSelectedItem();
        int    size  = Integer.parseInt(getCh3().getSelectedItem());
        int    style = 0;
        String s     = getCh2().getSelectedItem();

        if (s.equals("Plain")) {
            style = 0;
        }

        if (s.equals("Bold")) {
            style = 1;
        }

        if (s.equals("Italic")) {
            style = 2;
        }

        // font=new Font(nm,style,size);
        outer.getPro().setFont_style(style);
        outer.getPro().setFont_size(size);
        outer.getPro().setFont_name(nm);
        getOuter()._setFontStyle();
    }

    void b1_Click(ActionEvent e) {
        changefont();
        dispose();
    }

    /**
     * @return the ch1
     */
    public Choice getCh1() {
        return ch1;
    }

    /**
     * @param ch1 the ch1 to set
     */
    public void setCh1(Choice ch1) {
        this.ch1 = ch1;
    }

    /**
     * @return the ch2
     */
    public Choice getCh2() {
        return ch2;
    }

    /**
     * @param ch2 the ch2 to set
     */
    public void setCh2(Choice ch2) {
        this.ch2 = ch2;
    }

    /**
     * @return the ch3
     */
    public Choice getCh3() {
        return ch3;
    }

    /**
     * @param ch3 the ch3 to set
     */
    public void setCh3(Choice ch3) {
        this.ch3 = ch3;
    }

    /**
     * @return the b1
     */
    public JButton getB1() {
        return b1;
    }

    /**
     * @param b1 the b1 to set
     */
    public void setB1(JButton b1) {
        this.b1 = b1;
    }

    /**
     * @return the fnt
     */
    public Font getFnt() {
        return fnt;
    }

    /**
     * @param fnt the fnt to set
     */
    public void setFnt(Font fnt) {
        this.fnt = fnt;
    }

    /**
     * @return the outer
     */
    public JFrame1 getOuter() {
        return outer;
    }

    /**
     * @param outer the outer to set
     */
    public void setOuter(JFrame1 outer) {
        this.outer = outer;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
