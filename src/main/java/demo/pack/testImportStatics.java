package demo.pack;

import java.io.IOException;
import java.util.Arrays;

import convert.base64.toFile.Base64Decoder;
import convert.base64.toFile.Base64Decoder.*;

import static convert.base64.toFile.Base64Decoder.*;


public class testImportStatics {

public static void testImportStaticsMethod(){
    try {
        System.out.println("Variable, which is static: "+tempString);
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

public static void main(String[] aa){
    testImportStaticsMethod();
}

}
