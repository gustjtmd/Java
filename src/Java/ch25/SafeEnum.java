package Java.ch25;

enum Animal2{
    DOG, CAT
}
enum Person2{
    MAN,WOMAN
}
public class SafeEnum {
    public static void main(String[] args) {
        who(Person2.MAN);
//      who(Animal2.DOG);
    }
    public static void who(Person2 man){
        switch (man){
            case MAN:
                System.out.println("남성 손님입니다.");
                break;
            case WOMAN:
                System.out.println("여성 손님입니다.");
        }
    }
}
