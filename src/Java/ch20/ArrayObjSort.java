package Java.ch20;
/*
    compareTo메소드 정의 기준
    int compareTo(Object o)
    - 인자로 전달된 o가 작다면 양의 정수 반환
    - 인자로 전달된 o가 크가면 음의 정수 반환
    - 인자로 전달된 o와 같다면 0을 반환
 */

import java.util.Arrays;

class Person implements Comparable{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Object o){
        Person p = (Person)o;
//        if(this.age>p.age)  //인자로 전달된 o가 작다면 양의 정수 반환
//            return 1;
//        else if(this.age<p.age) //인자로 전달된 o가 크다면 음의 정수 반환
//            return -1;
//        else        //o와 같다면 0
//            return 0;
        return p.age-this.age;
    }
    @Override
    public String toString(){
        return name + ": " +age;
    }
}
public class ArrayObjSort {
    public static void main(String[] args) {
        Person[] ar = new Person[3];
        ar[0] = new Person("Lee",29);
        ar[1] = new Person("Goo",15);
        ar[2] = new Person("Seo",37);

        Arrays.sort(ar);
        for(Person p : ar)
            System.out.println(p);
    }
}
/*
    간단히
    public int compareTo(Object o)
    Person p = (Person)o
    return this.age - p.age;
 */