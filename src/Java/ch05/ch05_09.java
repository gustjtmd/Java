package Java.ch05;
/*
    자연수 1부터 시작해서 모든 홀수를 더해 나간다. 그리고 그 합이 언제(몇을 더했을때) 1000을 넘어서는지
    그리고 1000을 넘어선 값은 얼마나 되는지 계산하여 출력하는 프로그램을 작성해보자
 */
public class ch05_09 {
    public static void main(String[] args) {
        int sum = 0;
        int x = 1;
        int thousand = 1000;
        for(x=1;;x++){
            if (x%2 != 0){
                sum += x;
                if (sum>thousand){
                    break;
                }
                System.out.println(sum);
            }

        }
        System.out.println("1000을 넘어서는 값 : " + sum);
        System.out.println("몇을 더했을때 1000이 넘어갔는가 : "+x);


    }
}
/*
정답 :
    {
        int sum = 0;
        int num = 1;

        while(true) {
            if(num % 2 != 0)
                sum += num;

            if(sum > 1000) {
                System.out.println(num + " 더할 때 1000을 넘는다.");
                System.out.println("초과된 값: " + sum);
                break;
            }

            num++;
        }
    }

 */