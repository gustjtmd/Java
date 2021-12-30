package Java.ch05;
//1부터 10까지의 곱의 결과를 출력하는 프로그램을 for문을 이용해서 작성해보자.
public class ch05_06 {
    public static void main(String[] args) {
        int x = 1;
        for(int y=1;y<=10;y++){
            x *= y;
            System.out.println(x);
        }
    }
}
/*
정답
        int result = 1;
        for(int i = 1; i <= 10; i++)
            result *= i;

        System.out.println("1~10까지의 곱: " + result);
 */