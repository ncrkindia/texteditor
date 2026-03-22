

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

/**
 *
 * @author NCRK (नवीन चौहान राजपूत खरदौनी)
 */
public class Property implements java.io.Serializable {
    public static String VERSION = "v1.1.4";
    Vector<String> savedFilesPath;
    Vector<String> savedFilesName;
    Vector<String> recentlyOpenedFilesPath;
    Vector<String> recentlyOpenedFilesName;
    int savedFilesCount;
    boolean isWordWrap;
    
    private static String path = System.getProperty("user.home") + "\\NCRK\\TextEditor\\"+Property.VERSION;
    private static File   file;
    private Color         bgcolor;
    private char[]        ch;
    private Color         fgcolor;
    private String        font_name;
    private int           font_size;
    private int           font_style;
    private String        look;
    String theme;
    String encodingName;
    private static Dimension     screensize;
     Rectangle rect ;
    String javaCompiler;
    String javaAppletViewer;
    String javaExecute;
    String cppCompiler;
    int cppCompilerType;//0 for not set ,1 for TCC , 2 for GNU
    private Property() 
    {
        System.out.println("Property() Constructor");
        savedFilesPath = new Vector<String>();
        savedFilesName = new Vector<String>();
        recentlyOpenedFilesPath = new Vector<String>();
        recentlyOpenedFilesName = new Vector<String>();
        savedFilesCount = 0;
        isWordWrap = true;
        
        fgcolor           = new Color(255,255,255);
        bgcolor           = new Color(00,99,66);
        font_size         = 20;
        font_name         = null;
        font_style        = 0;
        screensize        = Toolkit.getDefaultToolkit().getScreenSize();
        screensize.height -= 40;
        look              = "Nimbus";
        theme = null;
        encodingName = "UTF-8";
        rect = new Rectangle(0,0,screensize.width,screensize.height);
        try
        {
            File f =  new File(path);
            f.mkdirs();
            f = new File(path+"\\visit.bat");
            FileOutputStream fout = new FileOutputStream(f);
            fout.write("start http://sourceForge.net/u/ncrkrajput".getBytes());
            fout.close();
            
            f = new File(path+"\\mailAtEngineer.bat");
            fout = new FileOutputStream(f);
            fout.write("start mailto:ncrkrajput@engineer.com".getBytes());
            fout.close();
            
            f = new File(path+"\\mailAtProgrammer.bat");
            fout = new FileOutputStream(f);
            fout.write("start mailto:ncrkrajput@programmer.net".getBytes());
            fout.close();
            f = new File(path+"\\facebook.bat");
            fout = new FileOutputStream(f);
            fout.write("start http://www.facebook.com/NCRK.Inc ".getBytes());
            fout.close();
            if(System.getProperty("java.home")!=null)
            {
                this.javaExecute = System.getProperty("java.home")+"/bin/java";
                File jdk = new File(new File(System.getProperty("java.home")).getParent()+"\\jdk"+System.getProperty("java.version"));
                System.out.println(jdk);
                if(jdk.exists())
                {
                    System.out.println(jdk+" exist");
                    this.javaCompiler = jdk+"/bin/javac";
                    this.javaAppletViewer = jdk+"/bin/appletviewer";
                }
            }
            
        }
        catch(Exception e)
        {
            
        }
        
    }

    public static Property getProperty(boolean RESET) {
        System.out.println(path);

        Property pro = null;

        try {
            file=new File(path);
            if (!file.exists()) 
            {
                file.mkdirs();
            }
            String s = path + "\\NCRK_TextEditor_"+VERSION+"_Property.ncrk" ;
            file = new File(s);
            if(RESET)
            {
                file.delete();
            }
            if (file.exists() ) {
                System.out.println("File exist");

                ObjectInputStream ois;
                FileInputStream   fis = new FileInputStream(file);

                ois = new ObjectInputStream(fis);
                pro = (Property) ois.readObject();
                ois.close();
            } else {
                System.out.println("File  not exist"+file.toString());
                pro = new Property();
            }
        } catch (Exception e) {
            e.printStackTrace();
            pro = new Property();
            //System.exit(0);
        }

        return pro;
    }

    public void writeProperties() {
       
        try  
        {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
                oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }   
    }

    /**
     * @return the font_name
     */
    public String getFont_name() {
        return font_name;
    }

    /**
     * @param font_name the font_name to set
     */
    public void setFont_name(String font_name) {
        this.font_name = font_name;
    }

    /**
     * @return the font_style
     */
    public int getFont_style() {
        return font_style;
    }

    /**
     * @param font_style the font_style to set
     */
    public void setFont_style(int font_style) {
        this.font_style = font_style;
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
     * @return the fgcolor
     */
    public Color getFgcolor() {
        return fgcolor;
    }

    /**
     * @param fgcolor the fgcolor to set
     */
    public void setFgcolor(Color fgcolor) {
        this.fgcolor = fgcolor;
    }

    /**
     * @return the bgcolor
     */
    public Color getBgcolor() {
        return bgcolor;
    }

    /**
     * @param bgcolor the bgcolor to set
     */
    public void setBgcolor(Color bgcolor) {
        this.bgcolor = bgcolor;
    }

    /**
     * @return the ch
     */
    public char[] getCh() {
        return ch;
    }

    /**
     * @param ch the ch to set
     */
    public void setCh(char[] ch) {
        this.ch = ch;
    }

    /**
     * @return the look
     */
    public String getLook() {
        return look;
    }

    /**
     * @param look the look to set
     */
    public void setLook(String look) {
        this.look = look;
    }

    /**
     * @return the screensize
     */
    public Dimension getScreensize() {
        return screensize;
    }

    /**
     * @param screensize the screensize to set
     */
    public void setScreensize(Dimension screensize) {
        this.screensize = screensize;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
