package Java.ch18;
/*
    try{
        ...
    }finally{   //코드 실행이 try 안으로 진입하면 무조건 실행된다.

    }
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FinallyCase {
    public static void main(String[] args) {
        Path file = Paths.get("C:\\javastudy\\Simple.txt");
        BufferedWriter writer = null;

        try{
            writer = Files.newBufferedWriter(file); //IOException 발생 가능 file를 오픈했으면
            writer.write('A');  //IOException 발생 가능
            writer.write('Z');  //IOException 발생 가능
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try{
                if(writer != null)
                    writer.close(); //꼭 닫아줘야함.  IOException 발생 가능
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
