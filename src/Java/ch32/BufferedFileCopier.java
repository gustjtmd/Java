package Java.ch32;

import java.io.*;
import java.util.Scanner;

public class BufferedFileCopier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("대상 파일 : ");
        String src = sc.nextLine();

        System.out.print("사본 이름 : ");
        String dst = sc.nextLine();

        try(InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dst)){
            byte buf[] = new byte[1024];
            int len;

            while(true) {
                len = in.read(buf);  //배열 buf로 데이터를 읽어 들이고,
                if(len == -1)
                    break;
                out.write(buf,0,len);   //len 바이트만큼 데이터를 저장한다.
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}