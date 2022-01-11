package Java.ch23;

import java.util.Comparator;
import java.util.TreeSet;

class StringComparator implements Comparator<String> {
    public int compare(String s1, String s2){
        return s2.length() - s1.length();
    }
}
public class ComparatorString {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>(new StringComparator());
        tree.add("Box");
        tree.add("Rabbit");
        tree.add("Robot");

        for(String s : tree)
            System.out.printf(s.toString()+'\t');
    }
}
