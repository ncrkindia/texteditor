


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.JPopupMenu;

/*
    Added in v1.1.3
*/
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
    
    public static PopupMenu popupmenu;
    static public void _addPopupMenuAtRightClick(final MainFrame outer,int index ,Point point)
       {
           System.out.println(index);
           _removePopupMenuAtRightClick(outer);
           final TextArea textarea = outer.textArea.get(index);
           String pathname = outer.path.get(index);
           popupmenu = new PopupMenu();
                        MenuItem cut = new MenuItem(" Cut");
                       cut.addActionListener(new ActionListener()
                         {
                            public void actionPerformed(ActionEvent e) 
                            {
                                PopupMenuAtTextArea._removePopupMenuAtRightClick(outer);
                                //textarea.cut();
                            }
                         }
                         );
                        MenuItem copy = new MenuItem("Copy ");
                        copy.addActionListener(new ActionListener()
                         {
                            public void actionPerformed(ActionEvent e) 
                            {
                                PopupMenuAtTextArea._removePopupMenuAtRightClick(outer);
                                //textarea.copy();
                            }
                         }
                         );
                        MenuItem  paste= new MenuItem("Paste ");
                        paste.addActionListener(new ActionListener()
                         {
                            public void actionPerformed(ActionEvent e) 
                            {
                                PopupMenuAtTextArea._removePopupMenuAtRightClick(outer);
                                //textarea.paste();
                            }
                         }
                         );
                        MenuItem selectall = new MenuItem("Select All");
                        selectall.addActionListener(new ActionListener()
                         {
                            public void actionPerformed(ActionEvent e) 
                            {
                                PopupMenuAtTextArea._removePopupMenuAtRightClick(outer);
                                textarea.selectAll();
                            }
                         }
                         );
                        Menu changeTo = new Menu("Change To");
                        MenuItem  uppercase = new MenuItem("UPPER CASE");
                        uppercase.addActionListener(new ActionListener()
                         {
                            public void actionPerformed(ActionEvent e) 
                            {
                                PopupMenuAtTextArea._removePopupMenuAtRightClick(outer);
                                try
                                {
                                    //textarea.replaceSelection(textarea.getSelectedText().toUpperCase());
                                }
                                catch(Exception ee){}
                            }
                         }
                         );
                        MenuItem  lowercase = new MenuItem("lower case");
                        lowercase.addActionListener(new ActionListener()
                         {
                            public void actionPerformed(ActionEvent e) 
                            {
                                PopupMenuAtTextArea._removePopupMenuAtRightClick(outer);
                                try
                                {
                                    //textarea.replaceSelection(textarea.getSelectedText().toLowerCase());
                                }
                                catch(Exception ee){}
                            }
                         }
                         );
                        MenuItem  encodeToUrl = new MenuItem("Encode to URL String");
                        encodeToUrl.addActionListener(new ActionListener()
                         {
                            public void actionPerformed(ActionEvent e) 
                            {
                                PopupMenuAtTextArea._removePopupMenuAtRightClick(outer);
                                try
                                {
                                    //textarea.replaceSelection(java.net.URLEncoder.encode(textarea.getSelectedText()));
                                }
                                catch(Exception ee)
                                {  
                                    System.out.println(ee);
                                }
                            }
                         }
                         );
                        MenuItem  decodeFromUrl = new MenuItem("Decode from URL String");
                        decodeFromUrl.addActionListener(new ActionListener()
                         {
                            public void actionPerformed(ActionEvent e) 
                            {
                                PopupMenuAtTextArea._removePopupMenuAtRightClick(outer);
                                try
                                {
                                    //textarea.replaceSelection(java.net.URLDecoder.decode(textarea.getSelectedText()));
                                }
                                catch(Exception ee)
                                {
                                    System.out.println(ee);
                                }
                            }
                         }
                         );
                        changeTo.add(uppercase);
                        changeTo.add(lowercase);
                        changeTo.addSeparator();
                        changeTo.add(encodeToUrl);
                        changeTo.add(decodeFromUrl);
                        MenuItem  find = new MenuItem("Find");
                        find.addActionListener(new ActionListener()
                         {
                            public void actionPerformed(ActionEvent e) 
                            {
                                PopupMenuAtTextArea._removePopupMenuAtRightClick(outer);
                                Search search = new Search(outer,1);
                                search.setVisible(true);
                            }
                         }
                         );
                         
                        MenuItem  replace = new MenuItem("Replace");
                        replace.addActionListener(new ActionListener()
                         {
                            public void actionPerformed(ActionEvent e) 
                            {
                                PopupMenuAtTextArea._removePopupMenuAtRightClick(outer);
                                Search search = new Search(outer,2);
                                search.setVisible(true);
                            }
                         }
                         );
                         
                        popupmenu.add(cut);
                        popupmenu.add(copy);
                        popupmenu.add(paste);
                        popupmenu.addSeparator();
                        popupmenu.add(selectall);
                        popupmenu.addSeparator();
                        popupmenu.add(changeTo);
                        //textarea.add(popupmenu);
                        outer.add(popupmenu);
                        popupmenu.addSeparator();
                        popupmenu.add(find);
                        popupmenu.add(replace);
                        if(pathname.toLowerCase().endsWith(".java"))
                        {
                            popupmenu.addSeparator();
                            MenuItem  compile = new MenuItem("Compile");
                            compile.addActionListener(new ActionListener()
                            {
                                public void actionPerformed(ActionEvent e) 
                                {
                                    PopupMenuAtTextArea._removePopupMenuAtRightClick(outer);
                                    outer._compileJavaFile();
                                }
                            }
                            );
                            MenuItem  runProgram = new MenuItem("Run as Main Program");
                            runProgram.addActionListener(new ActionListener()
                            {
                                public void actionPerformed(ActionEvent e) 
                                {
                                    PopupMenuAtTextArea._removePopupMenuAtRightClick(outer);
                                    outer._runJavaProgram();
                                }
                            }
                            );
                            MenuItem  runApplet = new MenuItem("Run As Applet");
                            runApplet.addActionListener(new ActionListener()
                            {
                                public void actionPerformed(ActionEvent e) 
                                {
                                    PopupMenuAtTextArea._removePopupMenuAtRightClick(outer);
                                    outer._runJavaApplet();
                                } 
                            }
                            );
                            popupmenu.add(compile);
                            popupmenu.add(runProgram);
                            popupmenu.add(runApplet);
                        }
                        if(pathname.toLowerCase().endsWith(".c")||pathname.toLowerCase().endsWith(".cpp"))
                        {
                            popupmenu.addSeparator();
                            MenuItem  compile = new MenuItem("Compile");
                            compile.addActionListener(new ActionListener()
                            {
                                public void actionPerformed(ActionEvent e) 
                                {
                                    PopupMenuAtTextArea._removePopupMenuAtRightClick(outer);
                                    outer._compileCppFile();
                                }
                            }
                            );
                            MenuItem  runProgram = new MenuItem("Run as Main Program");
                            runProgram.addActionListener(new ActionListener()
                            {
                                public void actionPerformed(ActionEvent e) 
                                {
                                    PopupMenuAtTextArea._removePopupMenuAtRightClick(outer);
                                    outer._runCppProgram();
                                }
                            }
                            );
                            popupmenu.add(compile);
                            popupmenu.add(runProgram);
                        }
                        if(textarea.getSelectedText()==null || textarea.getSelectedText().length()==0)
                        {
                            find.setEnabled(false);
                            replace.setEnabled(false);
                            cut.setEnabled(false);
                            copy.setEnabled(false);
                            changeTo.setEnabled(false);
                        }
                        popupmenu.show(outer, point.x, point.y);
                        //popupmenu.setLocation(point);
                        //popupmenu.setVisible(true);
                        //popupmenu.grabFocus();
                        //textarea.add(null);
           //outer.add(popupmenu);
       }
    static public void _removePopupMenuAtRightClick(MainFrame outer)
    {
        try
        {
           // popupmenu.setVisible(false);
           
        }
        catch(Exception e){}
        popupmenu=null;
    }
}
