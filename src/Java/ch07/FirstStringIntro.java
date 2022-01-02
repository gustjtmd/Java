package Java.ch07;

public class FirstStringIntro {
    public static void main(String[] args) {
        //문자열 선언과 동시에 참조변수로 참조한다.
        String str1 = "Happy";
        String str2 = "BirthDay";
        System.out.println(str1 + " " + str2);

        //메소드에 문자열을 전달하는 다양한 방법을 보여준다.
        printString(str1);
        printString(" ");
        printString(str2);
        printString("\n");
        printString("End of program!\n");
    }
    public static void printString(String str){
        System.out.print(str);
    }
}
/*
    문자열을 메소드의 인자로 전달할 수 있다.
    매개변수로 String형 참조변수를 선언하여 문자열을인자로 전달받을 수 있다.
 */
