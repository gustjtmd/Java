package Java.ch20;

import java.util.Arrays;

/*
    이름의 길이순으로 정렬해보자.
 */
class Person3 implements Comparable {
    String name;
    int age;

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Object o) {
        Person3 p = (Person3)o;
        return this.name.length() - p.name.length();
    }

    public String toString() {
        return name + " :" + age;
    }
}
public class ch20_3 {
    public static void main(String[] args) {
        Person3[] ar = new Person3[4];
        ar[0] = new Person3("Le",22);
        ar[1] = new Person3("wpqkf",30);
        ar[2] = new Person3("Kim",30);
        ar[3] = new Person3("Seoo",35);

        Arrays.sort(ar);
        for(Person3 p : ar){
            System.out.println(p);
        }
    }
}
