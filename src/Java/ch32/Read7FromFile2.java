package Java.ch32;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Read7FromFile2 {
    public static void main(String[] args) throws IOException {
        InputStream in = null;

        try{
            in = new FileInputStream("data.dat");
            int dat = in.read();
            System.out.println(dat);
        }finally {
            if(in != null)  //입력 스트림 생성에 성공했다면,
                in.close();
        }
    }
}
