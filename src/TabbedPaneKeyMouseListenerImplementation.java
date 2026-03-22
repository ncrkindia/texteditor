


import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

/*
    since v1.1.2
*/

public class TabbedPaneKeyMouseListenerImplementation implements java.awt.event.KeyListener ,java.awt.event.MouseListener
{
    MainFrame f;
    TabbedPaneKeyMouseListenerImplementation(MainFrame f)
    {
        this.f = f;
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
        PopupMenuAtTextArea._removePopupMenuAtRightClick(f);
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
         int index = f.getjTabbedPane2().getSelectedIndex();
        int length = f.textArea.get(index).getText().getBytes().length;
        String p = f.path.get(index);
        f.jLabel2.setText("Size:"+length+" bytes        FILE:"+p);
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        int index = f.getjTabbedPane2().getSelectedIndex();
        int length = f.textArea.get(index).getText().getBytes().length;
        String p = f.path.get(index);
        f.jLabel2.setText("Size:"+length+" bytes        FILE:"+p);
    }

    @Override
    public void mousePressed(MouseEvent e) 
    {
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
