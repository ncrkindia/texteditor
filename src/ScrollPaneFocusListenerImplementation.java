


import java.awt.TextArea;
import java.awt.event.FocusEvent;
import javax.swing.JTextArea;

/*
    since v1.1.2
*/
public class ScrollPaneFocusListenerImplementation implements java.awt.event.FocusListener
{

    MainFrame f;
    ScrollPaneFocusListenerImplementation(MainFrame f)
    {
        this.f=f;
    }
    @Override
    public void focusGained(FocusEvent e)
    {
        TextArea ta = f.textArea.get(f.getjTabbedPane2().getSelectedIndex());
        int length = ta.getText().getBytes().length;
        f.jLabel2.setText(length+"");
    }

    @Override
    public void focusLost(FocusEvent e)
    {
        
    }
    
}
