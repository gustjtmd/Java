package Java.ch23;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>(); //유일한 변화

        list.add("Toy");
        list.add("Box");
        list.add("Robot");

        for(int i =0; i < list.size(); i++)
            System.out.print(list.get(i)+'\t');
        System.out.println();

        list.remove(0);

        for(int i=0; i< list.size();i++)
            System.out.print(list.get(i) + '\t');
        System.out.println();
    }
}
