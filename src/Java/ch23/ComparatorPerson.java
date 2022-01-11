package Java.ch23;

import java.util.Comparator;
import java.util.TreeSet;

class Person5 implements Comparable<Person5>{
    String name;
    int age;
    public Person5(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){return name + " : "+ age;}

    @Override
    public int compareTo(Person5 p){
        return this.age-p.age;
    }
}
class PersonComparator implements Comparator<Person5>{
    public int compare(Person5 p1, Person5 p2) {
        return p2.age - p1.age;
    }
}
public class ComparatorPerson {
    public static void main(String[] args) {
        TreeSet<Person5> tree = new TreeSet<>(new PersonComparator());
        tree.add(new Person5("YOON", 37));
        tree.add(new Person5("HONG", 53));
        tree.add(new Person5("PARK", 22));

        for(Person5 p : tree)
            System.out.println(p);
    }
}
