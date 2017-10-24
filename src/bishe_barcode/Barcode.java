package bishe_barcode;

/*
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
 
import org.krysalis.barcode4j.impl.code39.Code39Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;
import org.krysalis.barcode4j.tools.UnitConv;
// Barcode.. 
public class Barcode {
 
    public static void main(String[] args) {
        try {
            //Create the barcode bean
            Code39Bean bean = new Code39Bean();
             
            final int dpi = 150;
             
            //Configure the barcode generator
            bean.setModuleWidth(UnitConv.in2mm(1.0f / dpi)); //makes the narrow bar 
                                                             //width exactly one pixel
            bean.setWideFactor(3);
            bean.doQuietZone(false);
             
            //Open output file
            File outputFile = new File("F:\\CQU\\JAVA\\out.png");
            OutputStream out = new FileOutputStream(outputFile);
            try {
                //Set up the canvas provider for monochrome JPEG output 
                BitmapCanvasProvider canvas = new BitmapCanvasProvider(
                        out, "image/png", dpi, BufferedImage.TYPE_BYTE_BINARY, false, 0);
             
                //Generate the barcode
                bean.generateBarcode(canvas, "A123456");
             
                //Signal end of generation
                canvas.finish();
            } finally {
                out.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
}
*/

/*
import java.awt.image.BufferedImage;  
import java.io.FileOutputStream;  
import org.jbarcode.JBarcode;  
import org.jbarcode.encode.EAN8Encoder;
import org.jbarcode.paint.EAN8TextPainter;
import org.jbarcode.paint.WidthCodedPainter;  
import org.jbarcode.util.ImageUtil;

public class Barcode {  
	 
    public static void main(String[] paramArrayOfString) {  
        try {  
            JBarcode localJBarcode = new JBarcode(EAN8Encoder.getInstance(),WidthCodedPainter.getInstance(),EAN8TextPainter.getInstance());  
            String str = "2219644";  
            BufferedImage localBufferedImage = localJBarcode.createBarcode(str);  
             
            saveToJPEG(localBufferedImage, "EAN8.jpg");
        }  
        catch (Exception localException) {  
            localException.printStackTrace();  
        }  
    }  
 
    static void saveToJPEG(BufferedImage paramBufferedImage, String paramString) {  
        saveToFile(paramBufferedImage, paramString, "jpeg");  
    }  
 
    static void saveToFile(BufferedImage paramBufferedImage, String paramString1, String paramString2) {  
        try {  
            FileOutputStream localFileOutputStream = new FileOutputStream("C:\\Users\\Administrator\\Desktop/" + paramString1);  
            ImageUtil.encodeAndWrite(paramBufferedImage, paramString2, localFileOutputStream, 96, 96);  
            localFileOutputStream.close();  
        }  
        catch (Exception localException) {  
            localException.printStackTrace();  
        }  
    }  
}
*/
