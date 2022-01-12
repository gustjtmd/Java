package Java.ch25;
enum Person20{
    MAN, WOMAN;
    private Person20(){
        System.out.println("Person constructor called");
    }
    @Override
    public String toString(){return "I love dog Person";}
}
public class EnumConstructor {
    public static void main(String[] args) {
        System.out.println(Person20.MAN);
        System.out.println(Person20.WOMAN);
    }
}
