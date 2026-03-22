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
import javax.swing.*;

/**
 *
 * @author NCRK (नवीन चौहान राजपूत खरदौनी)
 */
class FontDialog extends JDialog {
    private Choice  ch1 = new Choice(); JLabel l1 = new JLabel("Font-Family");
    private Choice  ch2 = new Choice();JLabel l2 = new JLabel("Font-Style");
    private Choice  ch3 = new Choice();JLabel l3 = new JLabel("Font-Size");
    private JButton b1  = new JButton("OK");JButton b2  = new JButton("CANCEL");
    private Font    fnt;
    private MainFrame outer;

    FontDialog(final MainFrame outer) {
        super(outer, "Choose Font", true);
        this.outer = outer;
        setSize(300, 250);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setTitle("Choose Font Style and Size");

        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();

        setLocation((screensize.width / 2) - (getSize().width / 2), (screensize.height / 2) - (getSize().height / 2));
        setLayout(null);
        ch1.setBounds(100, 50, 150, 25);
        add(ch1);
        l1.setBounds(30, 50, 150, 25);
        add(l1);
        ch2.setBounds(100, 90, 150, 25);
        add(ch2);
        l2.setBounds(30, 90, 150, 25);
        add(l2);
        ch3.setBounds(100, 130, 150, 25);
        add(ch3);
        l3.setBounds(30, 130, 150, 25);
        add(l3);
        b1.setBounds(30,160, 100, 25);
        add(b1);
        b2.setBounds(150,160, 100, 25);
        add(b2);
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
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        ch1.select(outer.getPro().getFont_name());
        ch3.select(outer.getPro().getFont_size()+"");
        
        if(outer.getPro().getFont_style()==0) ch2.select("Plain");
        else if(outer.getPro().getFont_style()==1) ch2.select("Bold");
        else if(outer.getPro().getFont_style()==2) ch2.select("Italic");
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
    public MainFrame getOuter() {
        return outer;
    }

    /**
     * @param outer the outer to set
     */
    public void setOuter(MainFrame outer) {
        this.outer = outer;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
