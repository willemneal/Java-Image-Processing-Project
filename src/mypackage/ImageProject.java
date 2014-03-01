package mypackage;
/**
 * File: ImageProject.java
 * 
 * Description:
 * This is a test file.
 * 
 * @author Yusuf Shakeel
 * @version 1.0
 * Date: 26-01-2014 sun
 */

import imageFX.*;
//import java.io.IOException;

public class ImageProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){//throws IOException {
        test();
    }//main() ends here
    
    public static void test(){
        MyImage iobj = new MyImage(1200,500);
        DYMosaic.myColorMosaic(iobj, DYColor.DYColor1, 20);
        //ImageFX.HSI_changeImageHue(iobj, 0);
        //ImageFX.crop(iobj, 0, 0, 300, 400);
        //ImageFX.createRandomImage(iobj);
        iobj.writeImage("D:\\Taj2-hsi.png");
    }
}//class ImageProject ends here