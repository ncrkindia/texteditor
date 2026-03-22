
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NCRK
 */
public class MainThread implements java.lang.Runnable
{
    static boolean RESET = false;
    String [] arg;
    Starting starting;
    MainThread(String[] args)
    {
        arg = args;
        Thread th = new Thread(this);
        th.start();
    }

    @Override
    public void run() 
    {
        Property pro = null;
        MainFrame f = null;
        if(arg!=null)
        {
            if(arg.length>10)
            {
                
                RESET = true;
                pro = Property.getProperty(true);
            }
            else
            {
                RESET = false;
                pro = Property.getProperty(false);
            }
        }
        else
        {
            RESET = false;
            pro = Property.getProperty(false);
        }
        
        try {
            if(pro.theme!=null)
            {
                 javax.swing.plaf.metal.MetalTheme theme = null;
                if(pro.theme.equals("Steel"))
                {
                    theme =new javax.swing.plaf.metal.DefaultMetalTheme();
                }
                else if(pro.theme.equals("Ocean"))
                {
                    theme=new javax.swing.plaf.metal.OceanTheme();
                }
                javax.swing.plaf.metal.MetalLookAndFeel.setCurrentTheme(theme);
            }
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (pro.getLook().equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        starting = new Starting(); 
        MainFrame.arg = arg;
        f =  new MainFrame(pro);
        try
        {
            Thread.sleep(1);
            
        }
        catch(InterruptedException e)
        {
            
        }
        starting.dispose();
        //starting.disable();
        //starting.setVisible(false);
        f.setVisible(true);
//         
    }
    
}
