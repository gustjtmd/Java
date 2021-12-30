package Java.ch05;
//1부터 100까지 출력하고 이어서 100에서 1까지 출력하는 프로그램을 작성해보자. 단 가급적 while문과 do ~ while문을 한 번씩 구현하자.
public class ch05_04 {
    public static void main(String[] args) {

        int num = 1;
        do {
            System.out.println(num);
            num ++;
        }while(num<=100);
        System.out.println(num);
        do {
            num --;
            System.out.println(num);
        }while(num>0);

    }
}
/*
정답 :
{
        int num = 1;

        while(num <= 100)
            System.out.println(num++);

        do {
            System.out.println(--num);
        } while(num>1);
    }
 */
