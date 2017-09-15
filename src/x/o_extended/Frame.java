package x.o_extended;

import java.awt.image.BufferedImage;
import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Frame extends JFrame{
    private static final int Width = 900;
    private static final int Height = 700;
    public static BufferedImage[] x_o_Images = new BufferedImage[2];
    
    public static int getHight() {
        return Height;
    }
    
    public static int getWIdth() {
        return Width;
    }
    
    public Frame() {
        setSize(Width, Height);
        
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        Fields.ImagesLoaded = loadImages();
    }
    private boolean loadImages()
    {
        File place = new File(".//images//x.png");
        try{
            if(!place.getParentFile().exists())
                place.getParentFile().mkdirs();
            if(!place.exists())
            {
                try(InputStream in = 
                        new URL("https://cdn.pixabay.com/photo/2012/04/12/20/12/x-30465_960_720.png")
                                .openStream()){
                    Files.copy(in, place.toPath());
                } catch (IOException ex) {
                    return false;
                }     
            }
            x_o_Images[0] =  ImageIO.read(place);
            
            place = new File(".//images//y.png");
            if(!place.exists())
            {
                try(InputStream in = 
                        new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/5/54/Red_Serif_O.svg/2000px-Red_Serif_O.svg.png")
                                .openStream()){
                    Files.copy(in, place.toPath());
                } catch (IOException ex) {
                    return false;
                }     
            }
            
            x_o_Images[1] = ImageIO.read(place);
            return true;
        }
        catch(IOException ee)
        {
            return false;
        }
    }
}
