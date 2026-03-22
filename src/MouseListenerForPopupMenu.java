


import java.awt.event.MouseEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NCRK
 */
public class MouseListenerForPopupMenu implements java.awt.event.MouseListener
{

    MainFrame outer;
    public MouseListenerForPopupMenu(MainFrame outer)
    {
        this.outer = outer;
    }
    @Override
    public void mouseClicked(MouseEvent e) 
    {
        int index = outer.jTabbedPane2.getSelectedIndex();
        System.out.println(index+"   "+e.getButton());
        if(e.getButton()==3)
        {
            System.out.println("Triggered");
        PopupMenuAtTextArea._addPopupMenuAtRightClick(outer,index,e.getLocationOnScreen());
        }
    }
    @Override
    public void mousePressed(MouseEvent e) 
    {
        if(e.getButton()!=3)
        {
            PopupMenuAtTextArea._removePopupMenuAtRightClick(outer);
        }
    }
    @Override
    public void mouseReleased(MouseEvent e) 
    {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) 
    {
        
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {
    
    }
    
}
