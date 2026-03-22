import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author NCRK (नवीन चौहान राजपूत खरदौनी)
 */
public class Property implements java.io.Serializable {
    private static String path = System.getProperty("user.home") + "\\NCRK\\TextEditor\\v3.0";
    private static File   file;
    private Color         bgcolor;
    private char[]        ch;
    private Color         fgcolor;
    private String        font_name;
    private int           font_size;
    private int           font_style;
    private String        look;
    private static Dimension     screensize;
    private Rectangle rect ;

    private Property() {
        fgcolor           = new Color(0, 153, 153);
        bgcolor           = new Color(153, 0, 51);
        font_size         = 20;
        font_name         = null;
        font_style        = 0;
        screensize        = Toolkit.getDefaultToolkit().getScreenSize();
        screensize.height -= 20;
        look              = "Nimbus";
        rect = new Rectangle(0,0,screensize.width,screensize.width);
    }

     /**
     * @return the path
     */
    public Rectangle getRect() {
        return rect;
    }

    /**
     * @param aPath the path to set
     */
    public  void setRect(Rectangle arect) {
        rect = arect;
    }
    /**
     * @return the path
     */
    public static String getPath() {
        return path;
    }

    /**
     * @param aPath the path to set
     */
    public static void setPath(String aPath) {
        path = aPath;
    }

    /**
     * @return the file
     */
    public static File getFile() {
        return file;
    }

    /**
     * @param aFile the file to set
     */
    public static void setFile(File aFile) {
        file = aFile;
    }

    public static Property getProperty(boolean RESET) {
        System.out.println(getPath());

        Property pro = null;

        try {
            setFile(new File(getPath()));

            if (!file.exists()) {
                getFile().mkdirs();
            }

            setFile(new File(path = getPath() + "\\NCRK_TextEditor_v3.0_Property.ncrk"));

            if (getFile().exists() && RESET) {
                System.out.println("File exist");

                ObjectInputStream ois;
                FileInputStream   fis = new FileInputStream(getFile());

                ois = new ObjectInputStream(fis);
                pro = (Property) ois.readObject();
                ois.close();
            } else {
                System.out.println("File  not exist");
                pro = new Property();
            }
        } catch (IOException | ClassNotFoundException e) {
            //e.printStackTrace();
            pro = new Property();
            //System.exit(0);
        }

        return pro;
    }

    public void writeProperties() {
        try {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(getFile()))) {
                oos.writeObject(this);
            }
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
