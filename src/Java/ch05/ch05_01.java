package Java.ch05;
/*
예제 Switch문을 if ~ else 문으로 바꿔보자
 */

public class ch05_01 {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 100;
        int big;
        int diff;

        if(num1 > num2){
            System.out.println("큰수  : " + num1);
        }
        else{
            System.out.println("큰수 : " + num2);
        }
        if(num1 > num2){
            System.out.println("절대값 : " + (num1 - num2));
        }
        else{
            System.out.println("절대값 : " + (num2 - num1));
        }
    }
}
/*
정답
{
        int num1 = 50;
        int num2 = 100;
        int big;
        int diff;

        if(num1 > num2)
            big = num1;
        else
            big = num2;

        System.out.println(big);

	if(num1 > num2)
            diff = num1 - num2;
        else
            diff = num2 - num1;

        System.out.println(diff);
    }
 */
