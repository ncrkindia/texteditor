
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naveen
 */
public class PopupMenuAtTextArea {
    /*
    static MainFrame outer;
    static int index;
    public PopupMenuAtTextArea(MainFrame outer,int index)
    {
        this.outer = outer;
        this.index = index;
    }
    
    */
    
    
    static public void _addPopupMenuAtRightClick(MainFrame outer,int index )
       {
           JTextArea textarea = outer.textArea.get(index);
           JPopupMenu popupmenu = new javax.swing.JPopupMenu();
                        JMenuItem cut = new JMenuItem(" Cut");
                        JMenuItem copy = new JMenuItem("Copy ");
                        JMenuItem  paste= new JMenuItem("Paste ");
                        //JMenuItem  = new JMenuItem(" ");
                        //JMenuItem  = new JMenuItem(" ");
                        //JMenuItem  = new JMenuItem(" ");
                        popupmenu.add(cut);
                        popupmenu.add(copy);
                        popupmenu.add(paste);
                        textarea.add(popupmenu);
                        //textarea.add(null);
           
           textarea.addMouseListener(new MouseAdapter()
           {
               public void mouseClicked(MouseEvent evt)
               {
                   if(true)
                   {
                        
                   }
               }
           }
           );
       }
}
