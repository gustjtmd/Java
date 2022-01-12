package Java.ch25;

class Person10{
    public static final Person10 MAN = new Person10();
    public static final Person10 WOMAN = new Person10();

    @Override
    public String toString(){
        return "I love dog Person";
    }
}
public class InClassInst {
    public static void main(String[] args) {
        System.out.println(Person10.MAN);
        System.out.println(Person10.WOMAN);
    }
}
