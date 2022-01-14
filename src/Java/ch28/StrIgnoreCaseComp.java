package Java.ch28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrIgnoreCaseComp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("robot");
        list.add("Lambda");
        list.add("box");
        Collections.sort(list,String::compareToIgnoreCase);
        System.out.println(list);
    }
}
