

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author NCRK (नवीन चौहान राजपूत खरदौनी)
 */
public class HelpBook1 extends JFrame
{
	JPanel indexPanel;
	JPanel viewPortPanel ;
	JScrollPane scrollPane;
        JTextArea textArea ;
	public HelpBook1()
	{
		System.out.println("Constructed");
		this.setBounds(50,50,800,600);
		this.setBackground(Color.blue);
		indexPanel = new JPanel();
		indexPanel.setBounds(0,0,200,600);
		indexPanel.setBackground(Color.black);
		viewPortPanel = new JPanel();
		viewPortPanel.setLocation(201,0);
		viewPortPanel.setBackground(Color.green);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(5,5,195,595);
		scrollPane.setBackground(Color.red);
                textArea = new JTextArea();
                scrollPane.add(textArea);
                
		this.add(indexPanel);
                this.add(scrollPane);
		//viewPortPanel.add(scrollPane);
		//this.add(viewPortPanel);
		this.setVisible(true);
	}
	public static void main(String[] args)
	{
		new HelpBook1();
	}
}