package Java.ch33;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) {
        Path pt1 = Paths.get("C:\\JavaStudy\\PathDemo.java");
        Path pt2 = pt1.getRoot();
        Path pt3 = pt1.getParent();
        Path pt4 = pt1.getFileName();

        System.out.println("Absoulute : "+ pt1);
        System.out.println("Rood : "+pt2);
        System.out.println("Parent : " + pt3);
        System.out.println("File : "+pt4);
    }
}
