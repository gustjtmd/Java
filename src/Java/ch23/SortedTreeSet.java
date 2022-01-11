package Java.ch23;

import java.util.Iterator;
import java.util.TreeSet;

public class SortedTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(1); tree.add(2); tree.add(3);
        tree.add(4); tree.add(5); tree.add(6);
        System.out.println("인스턴스의 수 : " +tree.size());

        //for-each문에 의한 반복
        for(Integer n : tree)
            System.out.print(n.toString()+ '\t');
        System.out.println();

        //Itreator 반복자에 의한 반복
        for(Iterator<Integer> itr = tree.iterator(); itr.hasNext();)
            System.out.print(itr.next().toString()+'\t');
        System.out.println();
    }
}
