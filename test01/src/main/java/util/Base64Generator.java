package util;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.util.Base64;
import java.util.Base64.Encoder;

public class Base64Generator {

  public static void main(String[] args) throws Exception {
    //바이너리 데이터를 문자화 시키는 것
    
    BufferedInputStream in = new BufferedInputStream(
        new FileInputStream("src/main/webapp/html/pic01.jpg"));
    
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    
    int b =0;
    while((b=in.read()) !=-1){
      out.write(b);
    }
    Encoder encoder = Base64.getEncoder();
    String result = encoder.encodeToString(out.toByteArray());
    System.out.println(result);
    out.close();
    in.close();
  }
}
