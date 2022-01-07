package Java.ch20;
/*
    앞서 제시한 예제를 나이의 역순으로 정렬이 되도록 해보자
 */

import java.util.Arrays;

class Person2 implements Comparable{
    private String name;
    private int age;

    public Person2(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Object o){
        Person2 p = (Person2)o;
        return p.age-this.age;
    }
    @Override
    public String toString(){
        return name + ": " +age;
    }
}
public class ch20_2 {
    public static void main(String[] args) {
        Person2[] ar = new Person2[3];
        ar[0] = new Person2("Lee",29);
        ar[1] = new Person2("Goo",15);
        ar[2] = new Person2("Seo",37);

        Arrays.sort(ar);
        for(Person2 p : ar)
            System.out.println(p);
    }
}
