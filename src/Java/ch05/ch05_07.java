package Java.ch05;
//구구단 중 5단을 출력하는 프로그램을 for문을 이용해서 작성해보자
public class ch05_07 {
    public static void main(String[] args) {
        int x = 5;
        for(int y=1;y<=9;y++){
            System.out.println(x+"*"+y+"="+x*y);
        }
    }

}
/*
    정답
    {
            for(int i = 1; i < 10; i++)
            System.out.println("5 x " + i + " = " + (5 * i));
    }
 */
