package review.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TryWithResource {
    public static void main(String[] args) {
        Path file = Paths.get("C:\\javastudy\\Simple");

        try(BufferedWriter writer = Files.newBufferedWriter(file)){
            writer.write('A');  //IOException 발생 가능
            writer.write('Z');  //IOException 발생 가능
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
