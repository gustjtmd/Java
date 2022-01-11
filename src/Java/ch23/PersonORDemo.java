package Java.ch23;

import java.util.HashSet;
import java.util.Objects;

class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return name +"(" + age+ "세)";
    }
    @Override
    public int hashCode(){
        return Objects.hash(name,age);
    }
    @Override
    public boolean equals(Object obj){
        String n = ((Person)obj).name;
        int a = ((Person)obj).age;
        /*
            Person p = (Person)obj;
            if(p.name.equals(name) && (p.age == age))
            return true;
        else
            return false;
         */

        if(name.equals(n) && age==a)
            return true;
        else
            return false;
    }
}

public class PersonORDemo {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        set.add(new Person("서승현",30));
        set.add(new Person("신대수",31));
        set.add(new Person("김준형",31));
        set.add(new Person("서승현",30));

        for(Person p : set)
            System.out.println(p.toString());
        System.out.println("저장된 데이터 수: " + set.size());
    }
}
