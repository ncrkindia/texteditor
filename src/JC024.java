import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;
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
	FileDialog  o ;
    String file="";
    java.awt.Scrollbar sb ;
	//Creating object of JJMenuBar
	JMenuBar mb = new JMenuBar();
	//Creating objects of JMenus
	JMenu m1 = new JMenu("File");
	JMenu m2 = new JMenu("Edit");
	JMenu m3 = new JMenu("Search");
	JMenu m4 = new JMenu("View");
	JMenu m5 = new JMenu("Setting");
	JMenu m6 = new JMenu("About Us");
	//Creating objects of JMenu's Items
	JMenuItem m1_1 = new JMenuItem("New");
	JMenuItem m1_2 = new JMenuItem("Open");
	JMenuItem m1_3 = new JMenuItem("Save");
	JMenuItem m1_4 = new JMenuItem("Save As");
	JMenuItem m1_5 = new JMenuItem("Close");
	JMenuItem m1_6 = new JMenuItem("Print");
	JMenuItem m1_7 = new JMenuItem("Exit");
	JMenuItem m2_1 = new JMenuItem("Undo");
	JMenuItem m2_2 = new JMenuItem("Redo");
	JMenuItem m2_3 = new JMenuItem("Cut");
	JMenuItem m2_4 = new JMenuItem("Copy");
	JMenuItem m2_5 = new JMenuItem("Paste");
	JMenuItem m2_6 = new JMenuItem("Delete");
	JMenuItem m2_7 = new JMenuItem("Select All");
	JMenuItem m3_1 = new JMenuItem("Find");
	JMenuItem m3_2 = new JMenuItem("Find Next");
	JMenuItem m3_3 = new JMenuItem("Find Previous");
	JMenuItem m3_4 = new JMenuItem("Replace");
	JMenuItem m3_5 = new JMenuItem("Replace All");
	JMenuItem m3_6 = new JMenuItem("Goto");
	JMenuItem m4_1 = new JMenuItem("Zoom IN");
	JMenuItem m4_2 = new JMenuItem("Zoom OUT");
	JMenuItem m4_3 = new JMenuItem("Font");
	JTextArea t = new JTextArea();
	int font_size = 18;
	Font font = new Font("Arial",1,font_size);
	
	Frame1()
	{
		setSize(700,600);
                sb = new java.awt.Scrollbar(0, 100, 5, 5, 95);
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
		m2_3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){t.cut();}});
		m2_4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){t.copy();}});
		m2_5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){t.paste();}});
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
                t.add(sb);
		changeTextForeground();
		
	}
	public void paint(Graphics g)
	{
		if(!file.equals("")) setTitle(file+"   --- Text Editor");
		super.paint(g);
	}
	

	void _new()
	{
		_close();
	}
	void _open()
	{
		_close();
		o = new FileDialog(this,"Open Files");
        o.setVisible(true);
        if(o.getFile()!=null)
        {
        file = o.getDirectory()+o.getFile();
        try
        {
            FileInputStream fin = new FileInputStream(file);
            int n = fin.available();
            byte[] b = new byte[n];
            fin.read(b,0,n);
            String str = new String(b);
            t.setText(str);
			fin.close();
            repaint();
        }catch(Exception e)
        {
            t.setText("");
        }
        }
	}
	void _save()
	{
		if(file.equals(""))
        {
        o = new FileDialog(this,"Save",1);
        o.setVisible(true);
		}
        if(o.getFile()!=null)
        {
        file = o.getDirectory()+o.getFile();
        try
        {
            FileOutputStream fout = new FileOutputStream(file);
            String txt = t.getText();
            byte[] b = txt.getBytes();
            fout.write(b,0,b.length);
            fout.close();
            repaint();
        }catch(Exception e)
        {
            
        }
		}
        
        
	}
	void _saveAs()
	{
		o = new FileDialog(this,"Save As",1);
        o.setVisible(true);
        if(o.getFile()!=null)
        {
        file = o.getDirectory()+o.getFile();
        try
        {
            FileOutputStream fout = new FileOutputStream(file);
            String txt = t.getText();
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
		
		file="";
		setTitle("Text Editor");
		t.setText("");
	}
	void _print()
	{
		
	}
	void _exit()
	{
		if(file.equals(""))
		{
		int a = JOptionPane.showConfirmDialog(this,"Are you sure to Exit?");
		if(a==0) System.exit(0);
		}
		else
		{
			try
        {
            FileInputStream fin = new FileInputStream(file);
            int n = fin.available();
            byte[] b = new byte[n];
            fin.read(b,0,n);
            String str = new String(b);
			fin.close();
            String str1 = t.getText();
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
				    FileOutputStream fout = new FileOutputStream(file);
					String txt = t.getText();
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
		JTextField t1 = new JTextField(t.getSelectedText());t1.setBounds(150,50,200,30);rp.add(t1);//t1.setBackground(new Color(152,148,58));
		JTextField t2 = new JTextField();t2.setBounds(150,100,200,30);rp.add(t2);//t2.setBackground(new Color(152,148,58));
		rp.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){rp.dispose();}});
		JButton b = new JButton("OK");b.setBounds(400,250,50,30);rp.add(b);
		b.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){String s1 =t1.getText();
		String s2=t2.getText();
		String text = t.getText().replace(s1,s2);
		t.setText(text);		}});
		
	}
	void _zoomIn()
	{
		if(font_size<45)
		{
			font_size++;
			t.setFont(new Font("Arial",1,font_size));
		}
		repaint();
	}
	void _zoomOut()
	{
		if(font_size>5)
		{
			font_size--;
			t.setFont(new Font("Arial",1,font_size));
		}
		repaint();
	}
	void _font()
	{
		
	}
	void changeTextForeground()
	{
		t.setSelectedTextColor(new Color(255,0,0));
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
}