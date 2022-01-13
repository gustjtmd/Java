package Java.ch27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class SlenCOmp implements Comparator<String>{
//    @Override
//    public int compare(String s1, String s2){
//        return s1.length()-s2.length();
//    }
//}
public class SlenComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Robot");
        list.add("Lambda");
        list.add("Box");

        Comparator<String> cs = (a,b) -> a.length()-b.length();
        //Collections.sort(list, (s1, s2) -> s1.length() - s2.length());     정렬
        Collections.sort(list,cs);
        for (String s : list)
            System.out.println(s);
    }
}
