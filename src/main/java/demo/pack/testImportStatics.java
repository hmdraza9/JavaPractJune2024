package demo.pack;

import java.io.IOException;

import convert.base64.toFile.Base64Decoder;
import convert.base64.toFile.Base64Decoder.*;

import static convert.base64.toFile.Base64Decoder.getFormat;
import static convert.base64.toFile.Base64Decoder.myBas64Decodeer;


public class testImportStatics {

public static void testImportStaticsMethod(){
    try {
        Base64Decoder.myBas64Decodeer();
        Base64Decoder.getFormat(" ");
        myBas64Decodeer();
        getFormat(" ");
    } catch (IOException e) {
        throw new RuntimeException(e);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}


}
