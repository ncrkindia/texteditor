
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naveen
 */
public class TimeDateUpdationThread extends Thread{
    java.util.Date date;
    javax.swing.JLabel l;
    TimeDateUpdationThread(javax.swing.JLabel l)
    {
        this.l = l;
        l.setForeground(Color.red);
        l.setHorizontalAlignment(javax.swing.JLabel.LEFT);
        this.setPriority(MIN_PRIORITY);
        this.start();
    }
    
    
    public void run()
    {
        while(true)
        {
            date = new java.util.Date();
            l.setText(date.toString());
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                
            }
        }
        
    }
    
}
