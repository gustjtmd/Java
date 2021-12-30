package Java.ch05;
//1000 이하 자연수 중에서 2의 배수이자 7의 배수인 수를 출력하고 그 수들의 합을 구해서 출력하는 프로그램을 while문으로 작성해보자.
public class ch05_05 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while(num<=1000){
            if(num %2 == 0 && num % 7 == 0){
               sum += num;
                System.out.println(num);
            }
            num++;
        }
        System.out.println("2의 배수이자 7의 배수인 합은 : " + sum);
    }
}
/*
정답
{
        int num = 1;
        int sum = 0;

        while(num <= 1000) {
            if((num % 2) == 0 && (num % 7) == 0) {
                System.out.println(num);
                sum += num;
            }
            num++;
        }

        System.out.println("합: " + sum);
    }
 */