package Java.ch20;
/*
    탐색 기준을 이름으로 해보자
 */

import java.util.Arrays;

class Person4 implements Comparable{
    String name;
    int age;
    public Person4(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int compareTo(Object o){
        Person4 p = (Person4)o;
        this.name.equals(p.name);
                return this.age-p.age;
    }
    public String toString(){
        return name +" :"+age;
    }
}

public class ArrayObjSearch {
    public static void main(String[] args) {
        Person4[] arr = new Person4[3];
        arr[0] = new Person4("Lee",29);
        arr[1] = new Person4("Goo",15);
        arr[2] = new Person4("Seo", 39);

        Arrays.sort(arr);   //탐색에 앞서 정렬을 진행
        int idx = Arrays.binarySearch(arr,new Person4("Goo",155));
        System.out.println(arr[idx]);
    }
}
/*
    정답 :
    public int compareTo(Object o) {
        Person p = (Person)o;
        return this.name.compareTo(p.name);
    }
 */