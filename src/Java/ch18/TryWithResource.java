package Java.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TryWithResource {
    public static void main(String[] args) {
        Path file = Paths.get("C:\\javastudy\\Simple.txt");

        try(BufferedWriter writer = Files.newBufferedWriter(file)){//리소스를 생성(Open)하고 자동으로 닫아줌(Close)
            writer.write('A');
            writer.write('Z');
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
/*
    try-with-resource 기반의 오픈 및 종료 대상은 java.lang.AutoCloseable 인퍼테이스를 구현해야 사용 가능 둘 이상의
    리소스에 대해서도 try-with-resources문을 사용 가능하다
    try(resource1; resource2){
    ...}catch (Exception name){
    }
 */