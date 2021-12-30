package Java.ch05;
//1부터 99까지의 합을 구하는 프로그램을 작성하되 while문을 이용해서 작성해보자.
public class ch05_03 {

    public static void main(String[] args) {

        int num = 0;
        int sum = 0;

        do{
            sum += num;
            num++;
        }while (num <100);{
            System.out.println(sum);
        }

    }
}
