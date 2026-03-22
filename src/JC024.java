import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.io.*;
import javax.swing.*;

class JC024
{
	public static void main(String[] a)
	{
		Frame1 f = new Frame1();
		f.setVisible(true);
	}
}
class Frame1 extends JFrame
{
    private static final long serialVersionUID = 1L;
	private FileDialog  o ;
    private String file="";
	//Creating object of JJMenuBar
	private JMenuBar mb = new JMenuBar();
	//Creating objects of JMenus
	private JMenu m1 = new JMenu("File");
	private JMenu m2 = new JMenu("Edit");
	private JMenu m3 = new JMenu("Search");
	private JMenu m4 = new JMenu("View");
	private JMenu m5 = new JMenu("Setting");
	private JMenu m6 = new JMenu("About Us");
	//Creating objects of JMenu's Items
	private JMenuItem m1_1 = new JMenuItem("New");
	private JMenuItem m1_2 = new JMenuItem("Open");
	private JMenuItem m1_3 = new JMenuItem("Save");
	private JMenuItem m1_4 = new JMenuItem("Save As");
	private JMenuItem m1_5 = new JMenuItem("Close");
	private JMenuItem m1_6 = new JMenuItem("Print");
	private JMenuItem m1_7 = new JMenuItem("Exit");
	private JMenuItem m2_1 = new JMenuItem("Undo");
	private JMenuItem m2_2 = new JMenuItem("Redo");
	private JMenuItem m2_3 = new JMenuItem("Cut");
	private JMenuItem m2_4 = new JMenuItem("Copy");
	private JMenuItem m2_5 = new JMenuItem("Paste");
	private JMenuItem m2_6 = new JMenuItem("Delete");
	private JMenuItem m2_7 = new JMenuItem("Select All");
	private JMenuItem m3_1 = new JMenuItem("Find");
	private JMenuItem m3_2 = new JMenuItem("Find Next");
	private JMenuItem m3_3 = new JMenuItem("Find Previous");
	private JMenuItem m3_4 = new JMenuItem("Replace");
	private JMenuItem m3_5 = new JMenuItem("Replace All");
	private JMenuItem m3_6 = new JMenuItem("Goto");
	private JMenuItem m4_1 = new JMenuItem("Zoom IN");
	private JMenuItem m4_2 = new JMenuItem("Zoom OUT");
	private JMenuItem m4_3 = new JMenuItem("Font");
	private JTextArea t = new JTextArea();
	private int font_size = 18;
	private Font font = new Font("Arial",1,font_size);
	
	Frame1()
	{
		setSize(700,600);
		//adding listener to activate close button of window
		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		//adding File JMenu
		mb.add(m1);
		m1.add(m1_1);m1.add(m1_2);m1.add(m1_3);m1.add(m1_4);m1.add(m1_5);m1.add(m1_6);m1.add(m1_7);
		mb.add(m2);
		m2.add(m2_1);m2.add(m2_2);m2.add(m2_3);m2.add(m2_4);m2.add(m2_5);m2.add(m2_6);m2.add(m2_7);
		mb.add(m3);
		m3.add(m3_1);m3.add(m3_2);m3.add(m3_3);m3.add(m3_4);m3.add(m3_5);m3.add(m3_6);
		mb.add(m4);
		m4.add(m4_1);m4.add(m4_2);m4.add(m4_3);
		mb.add(m5);
		mb.add(m6);
		m1_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_MASK| InputEvent.ALT_MASK ));
		m1_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_MASK));
		m1_3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
		m1_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK | InputEvent.ALT_MASK ));
		m1_5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,InputEvent.CTRL_MASK));
		m1_6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,InputEvent.CTRL_MASK));
		m1_7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.ALT_MASK));
		m2_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y,InputEvent.CTRL_MASK));
		m2_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,InputEvent.CTRL_MASK));
		m2_3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.CTRL_MASK));
		m2_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.CTRL_MASK));
		m2_5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,InputEvent.CTRL_MASK));
		m2_6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE,0));
		m2_7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,InputEvent.CTRL_MASK));
		
		m3_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,InputEvent.CTRL_MASK));
		m3_6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,InputEvent.CTRL_MASK));
		m4_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS,InputEvent.CTRL_MASK));		
		m4_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS,InputEvent.CTRL_MASK));
		m1_1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){_new();}});
		m1_2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){_open();}});
		m1_3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){_save();}});
		m1_4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){_saveAs();}});
		m1_5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){_close();}});
		m1_6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){_print();}});
		m1_7.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){_exit();}});
		m2_1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){_new();}});
		m2_2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){_open();}});
		m2_3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){getT().cut();}});
		m2_4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){getT().copy();}});
		m2_5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){getT().paste();}});
		m2_6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){_print();}});
		m2_7.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){_exit();}});
		m3_4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){_replaceAll();}});
		m3_5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){_replaceAll();}});
		m3_6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){}});
		m4_1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){_zoomIn();}});
		m4_2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){_zoomOut();}});
		m4_3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){_font();}});
	/*	m6.addMenuKeyListener(new MenuKeyListener()
		{
			public void menuKeyTyped(MenuKeyEvent e)
			 {
				 _aboutUs();
			 }
   public void menuKeyPressed(MenuKeyEvent e)
	{
		//_aboutUs();
	}
   public void menuKeyReleased(MenuKeyEvent e)
	{
		//_aboutUs();
	}
		});*/
	//m6.addMouseListener(new MouseInputAdapter(MouseEvent e)}{public void mouseClicked(){_aboutUs();}});
		setJMenuBar(mb);
		setTitle("Text Editor");
		t.setFont(font);
		t.setForeground(new Color(0, 153, 255));
		add(t);
		changeTextForeground();
		
	}
	public void paint(Graphics g)
	{
		if(!file.equals("")) setTitle(getFile()+"   --- Text Editor");
		super.paint(g);
	}
	

	void _new()
	{
		_close();
	}
	void _open()
	{
		_close();
		setO(new FileDialog(this,"Open Files"));
        getO().setVisible(true);
        if(getO().getFile()!=null)
        {
            setFile(getO().getDirectory() + getO().getFile());
        try
        {
                try (FileInputStream fin = new FileInputStream(getFile())) {
                    int n = fin.available();
                    byte[] b = new byte[n];
                    fin.read(b,0,n);
                    String str = new String(b);
                    getT().setText(str);
                }
            repaint();
        }catch(IOException e)
        {
                getT().setText("");
        }
        }
	}
	void _save()
	{
		if(getFile().equals(""))
        {
            setO(new FileDialog(this,"Save",1));
            getO().setVisible(true);
		}
        if(getO().getFile()!=null)
        {
            setFile(getO().getDirectory() + getO().getFile());
        try
        {
                try (FileOutputStream fout = new FileOutputStream(getFile())) {
                    String txt = getT().getText();
                    byte[] b = txt.getBytes();
                    fout.write(b,0,b.length);
                }
            repaint();
        }catch(IOException e)
        {
            
        }
		}
        
        
	}
	void _saveAs()
	{
		setO(new FileDialog(this,"Save As",1));
        getO().setVisible(true);
        if(getO().getFile()!=null)
        {
            setFile(getO().getDirectory() + getO().getFile());
        try
        {
            FileOutputStream fout = new FileOutputStream(getFile());
            String txt = getT().getText();
            byte[] b = txt.getBytes();
            fout.write(b,0,b.length);
            fout.close();
            repaint();
        }catch(Exception e)
        {
            
        }
        }
	}
	void _close()
	{
		if(!t.getText().equals(""))
		{
			int choice = JOptionPane.showConfirmDialog(this,"Do you want to save the changes before exiting file?");
			if(choice == 0) _save();
		}
		
		setFile("");
		setTitle("Text Editor");
		getT().setText("");
	}
	void _print()
	{
		
	}
	void _exit()
	{
		if(getFile().equals(""))
		{
		int a = JOptionPane.showConfirmDialog(this,"Are you sure to Exit?");
		if(a==0) System.exit(0);
		}
		else
		{
			try
        {
            FileInputStream fin = new FileInputStream(getFile());
            int n = fin.available();
            byte[] b = new byte[n];
            fin.read(b,0,n);
            String str = new String(b);
			fin.close();
            String str1 = getT().getText();
           if(str.equals(str1))
		   {
			   int choice = JOptionPane.showConfirmDialog(this,"Are you sure to Exit?");
			   if(choice==0) System.exit(0);
		   }
		   else
		   {
			   int choice = JOptionPane.showConfirmDialog(this,"Do you want to save the changes before exiting?");
			   if(choice==0) 
			   {
				    FileOutputStream fout = new FileOutputStream(getFile());
					String txt = getT().getText();
					b = txt.getBytes();
					fout.write(b,0,b.length);
					fout.close();
			   }
			   System.exit(0);
			   
		   }
        }catch(Exception e)
        {
        }
		}
	}
	void _replaceAll()
	{
		JDialog rp = new JDialog(this,"Replace All");rp.setBounds(100,50,500,300);rp.setVisible(true);rp.setLayout(null);
		JLabel l1 = new JLabel("Replace");l1.setBounds(10,50,50,30);rp.add(l1);
		JLabel l2 = new JLabel("With");l2.setBounds(10,100,50,30);rp.add(l2);
		JTextField t1 = new JTextField(getT().getSelectedText());t1.setBounds(150,50,200,30);rp.add(t1);//t1.setBackground(new Color(152,148,58));
		JTextField t2 = new JTextField();t2.setBounds(150,100,200,30);rp.add(t2);//t2.setBackground(new Color(152,148,58));
		rp.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){rp.dispose();}});
		JButton b = new JButton("OK");b.setBounds(400,250,50,30);rp.add(b);
		b.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){String s1 =t1.getText();
		String s2=t2.getText();
		String text = getT().getText().replace(s1,s2);
		getT().setText(text);		}});
		
	}
	void _zoomIn()
	{
		if(getFont_size()<45)
		{
			setFont_size(getFont_size() + 1);
			getT().setFont(new Font("Arial",1, getFont_size()));
		}
		repaint();
	}
	void _zoomOut()
	{
		if(getFont_size()>5)
		{
			setFont_size(getFont_size() - 1);
			getT().setFont(new Font("Arial",1, getFont_size()));
		}
		repaint();
	}
	void _font()
	{
		
	}
	void changeTextForeground()
	{
		getT().setSelectedTextColor(new Color(255,0,0));
	}
	void _aboutUs()
	{
		Dialog d = new Dialog(this,"About Us ");
		d.setBounds(200,100,400,400);
		d.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){d.dispose();;}});
		d.setVisible(true);
		Label a1 = new Label("NCRK Rajput",Label.CENTER);d.add(a1);
		Label a2 = new Label("This Program is design in",Label.CENTER);d.add(a2);
		Label a3 = new Label("SUNRISE Technologies ",Label.CENTER);d.add(a3);
		Label a4 = new Label("during practice of Java Programming",Label.CENTER);d.add(a4);
		a1.setBounds(0,50,400,50);
		a2.setBounds(0,80,400,50);
		a3.setBounds(0,110,400,50);
		a4.setBounds(0,140,400,50);
	}

    /**
     * @return the o
     */
    public FileDialog getO() {
        return o;
    }

    /**
     * @param o the o to set
     */
    public void setO(FileDialog o) {
        this.o = o;
    }

    /**
     * @return the file
     */
    public String getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(String file) {
        this.file = file;
    }

    /**
     * @return the mb
     */
    public JMenuBar getMb() {
        return mb;
    }

    /**
     * @param mb the mb to set
     */
    public void setMb(JMenuBar mb) {
        this.mb = mb;
    }

    /**
     * @return the m1
     */
    public JMenu getM1() {
        return m1;
    }

    /**
     * @param m1 the m1 to set
     */
    public void setM1(JMenu m1) {
        this.m1 = m1;
    }

    /**
     * @return the m2
     */
    public JMenu getM2() {
        return m2;
    }

    /**
     * @param m2 the m2 to set
     */
    public void setM2(JMenu m2) {
        this.m2 = m2;
    }

    /**
     * @return the m3
     */
    public JMenu getM3() {
        return m3;
    }

    /**
     * @param m3 the m3 to set
     */
    public void setM3(JMenu m3) {
        this.m3 = m3;
    }

    /**
     * @return the m4
     */
    public JMenu getM4() {
        return m4;
    }

    /**
     * @param m4 the m4 to set
     */
    public void setM4(JMenu m4) {
        this.m4 = m4;
    }

    /**
     * @return the m5
     */
    public JMenu getM5() {
        return m5;
    }

    /**
     * @param m5 the m5 to set
     */
    public void setM5(JMenu m5) {
        this.m5 = m5;
    }

    /**
     * @return the m6
     */
    public JMenu getM6() {
        return m6;
    }

    /**
     * @param m6 the m6 to set
     */
    public void setM6(JMenu m6) {
        this.m6 = m6;
    }

    /**
     * @return the m1_1
     */
    public JMenuItem getM1_1() {
        return m1_1;
    }

    /**
     * @param m1_1 the m1_1 to set
     */
    public void setM1_1(JMenuItem m1_1) {
        this.m1_1 = m1_1;
    }

    /**
     * @return the m1_2
     */
    public JMenuItem getM1_2() {
        return m1_2;
    }

    /**
     * @param m1_2 the m1_2 to set
     */
    public void setM1_2(JMenuItem m1_2) {
        this.m1_2 = m1_2;
    }

    /**
     * @return the m1_3
     */
    public JMenuItem getM1_3() {
        return m1_3;
    }

    /**
     * @param m1_3 the m1_3 to set
     */
    public void setM1_3(JMenuItem m1_3) {
        this.m1_3 = m1_3;
    }

    /**
     * @return the m1_4
     */
    public JMenuItem getM1_4() {
        return m1_4;
    }

    /**
     * @param m1_4 the m1_4 to set
     */
    public void setM1_4(JMenuItem m1_4) {
        this.m1_4 = m1_4;
    }

    /**
     * @return the m1_5
     */
    public JMenuItem getM1_5() {
        return m1_5;
    }

    /**
     * @param m1_5 the m1_5 to set
     */
    public void setM1_5(JMenuItem m1_5) {
        this.m1_5 = m1_5;
    }

    /**
     * @return the m1_6
     */
    public JMenuItem getM1_6() {
        return m1_6;
    }

    /**
     * @param m1_6 the m1_6 to set
     */
    public void setM1_6(JMenuItem m1_6) {
        this.m1_6 = m1_6;
    }

    /**
     * @return the m1_7
     */
    public JMenuItem getM1_7() {
        return m1_7;
    }

    /**
     * @param m1_7 the m1_7 to set
     */
    public void setM1_7(JMenuItem m1_7) {
        this.m1_7 = m1_7;
    }

    /**
     * @return the m2_1
     */
    public JMenuItem getM2_1() {
        return m2_1;
    }

    /**
     * @param m2_1 the m2_1 to set
     */
    public void setM2_1(JMenuItem m2_1) {
        this.m2_1 = m2_1;
    }

    /**
     * @return the m2_2
     */
    public JMenuItem getM2_2() {
        return m2_2;
    }

    /**
     * @param m2_2 the m2_2 to set
     */
    public void setM2_2(JMenuItem m2_2) {
        this.m2_2 = m2_2;
    }

    /**
     * @return the m2_3
     */
    public JMenuItem getM2_3() {
        return m2_3;
    }

    /**
     * @param m2_3 the m2_3 to set
     */
    public void setM2_3(JMenuItem m2_3) {
        this.m2_3 = m2_3;
    }

    /**
     * @return the m2_4
     */
    public JMenuItem getM2_4() {
        return m2_4;
    }

    /**
     * @param m2_4 the m2_4 to set
     */
    public void setM2_4(JMenuItem m2_4) {
        this.m2_4 = m2_4;
    }

    /**
     * @return the m2_5
     */
    public JMenuItem getM2_5() {
        return m2_5;
    }

    /**
     * @param m2_5 the m2_5 to set
     */
    public void setM2_5(JMenuItem m2_5) {
        this.m2_5 = m2_5;
    }

    /**
     * @return the m2_6
     */
    public JMenuItem getM2_6() {
        return m2_6;
    }

    /**
     * @param m2_6 the m2_6 to set
     */
    public void setM2_6(JMenuItem m2_6) {
        this.m2_6 = m2_6;
    }

    /**
     * @return the m2_7
     */
    public JMenuItem getM2_7() {
        return m2_7;
    }

    /**
     * @param m2_7 the m2_7 to set
     */
    public void setM2_7(JMenuItem m2_7) {
        this.m2_7 = m2_7;
    }

    /**
     * @return the m3_1
     */
    public JMenuItem getM3_1() {
        return m3_1;
    }

    /**
     * @param m3_1 the m3_1 to set
     */
    public void setM3_1(JMenuItem m3_1) {
        this.m3_1 = m3_1;
    }

    /**
     * @return the m3_2
     */
    public JMenuItem getM3_2() {
        return m3_2;
    }

    /**
     * @param m3_2 the m3_2 to set
     */
    public void setM3_2(JMenuItem m3_2) {
        this.m3_2 = m3_2;
    }

    /**
     * @return the m3_3
     */
    public JMenuItem getM3_3() {
        return m3_3;
    }

    /**
     * @param m3_3 the m3_3 to set
     */
    public void setM3_3(JMenuItem m3_3) {
        this.m3_3 = m3_3;
    }

    /**
     * @return the m3_4
     */
    public JMenuItem getM3_4() {
        return m3_4;
    }

    /**
     * @param m3_4 the m3_4 to set
     */
    public void setM3_4(JMenuItem m3_4) {
        this.m3_4 = m3_4;
    }

    /**
     * @return the m3_5
     */
    public JMenuItem getM3_5() {
        return m3_5;
    }

    /**
     * @param m3_5 the m3_5 to set
     */
    public void setM3_5(JMenuItem m3_5) {
        this.m3_5 = m3_5;
    }

    /**
     * @return the m3_6
     */
    public JMenuItem getM3_6() {
        return m3_6;
    }

    /**
     * @param m3_6 the m3_6 to set
     */
    public void setM3_6(JMenuItem m3_6) {
        this.m3_6 = m3_6;
    }

    /**
     * @return the m4_1
     */
    public JMenuItem getM4_1() {
        return m4_1;
    }

    /**
     * @param m4_1 the m4_1 to set
     */
    public void setM4_1(JMenuItem m4_1) {
        this.m4_1 = m4_1;
    }

    /**
     * @return the m4_2
     */
    public JMenuItem getM4_2() {
        return m4_2;
    }

    /**
     * @param m4_2 the m4_2 to set
     */
    public void setM4_2(JMenuItem m4_2) {
        this.m4_2 = m4_2;
    }

    /**
     * @return the m4_3
     */
    public JMenuItem getM4_3() {
        return m4_3;
    }

    /**
     * @param m4_3 the m4_3 to set
     */
    public void setM4_3(JMenuItem m4_3) {
        this.m4_3 = m4_3;
    }

    /**
     * @return the t
     */
    public JTextArea getT() {
        return t;
    }

    /**
     * @param t the t to set
     */
    public void setT(JTextArea t) {
        this.t = t;
    }

    /**
     * @return the font_size
     */
    public int getFont_size() {
        return font_size;
    }

    /**
     * @param font_size the font_size to set
     */
    public void setFont_size(int font_size) {
        this.font_size = font_size;
    }

    /**
     * @return the font
     */
    public Font getFont() {
        return font;
    }

    /**
     * @param font the font to set
     */
    public void setFont(Font font) {
        this.font = font;
    }
}