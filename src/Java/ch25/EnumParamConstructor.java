package Java.ch25;
enum Person30{
    MAN(29), WOMAN(25);

    int age;
    private Person30(int age){
        this.age = age;
    }
    @Override
    public String toString(){return "I am " + age + " years old";
    }
}
public class EnumParamConstructor {
    public static void main(String[] args) {
        System.out.println(Person30.MAN);
        System.out.println(Person30.WOMAN);
    }
}
