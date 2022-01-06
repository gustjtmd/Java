package Java.ch18;
/*
    예외 클래스의 구분 : 최상위 Throwable를 상속하는 세가지의 예외 클래스
    1. Error 클래스를 상속하는 예외 클래스
    2. Exception 클래스를 상속하는 예외 클래스
    3. RuntimeException 클래스를 상속하는 예외 클래스 ->

    EXception클래스를 상속하는 예외는 try~catch문으로 처리하거나 다른 영역으로 넘기낟고 반드시 명시해야 한다.
    java.io.IOExeption -Exception을 상속하는 예외클래스
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOExceptionCase {

    public static void main(String[] args) {
        try{
            md1();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void md1() throws IOException{
        md2();
    }

    public static void md2() throws IOException{//IOException 예외 넘긴다고 명시
        Path file = Paths.get("C:\\javasutdy\\simple.txt");
        BufferedWriter writer = null;
        writer = Files.newBufferedWriter(file); //IOException 발생가능
        writer.write('A');  //IOException발생 가능
        writer.write('Z');  //IOException발생 가능

        if(writer != null)
            writer.close(); //IOException 발생 가능
    }
}
/*
    throws 선언을 통해서 둘 이상의 예외에 대해 그 처리를 넘긴다는 표시도 할 수 있음
    public void simpleWrite() throws IOException, IndexOutofBoundsException
    정리 :
    Error를 상속하거나 RuntimeException을 상속하는 예외 발생 코드 작성에서는 특별히 무언가를 하지 않아도 되지만
    Exception을 상속하는 예외의 발생에 대해서는 try ~catch 문을 통해서 예외를 처리하거나 throws 선언을 통해서 예외의 처리를 넘긴다는 표시를 꼭
    해야한다.

 */