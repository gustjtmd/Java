package Java.ch10;

/*
    다음 main 메소드와 함께 동작하는 Accumulator 클래스를 정의하자. 그리고 Accumulator클래스에 main 메소드도 넣어서 컴파일 실행하자
 */

class Accumulator{
    static int i=0;
    static void add(int x){
        i += x;
    }
    static void showResult(){
        System.out.println("sum : " +i);
    }
}

public class ch10_1 {
    public static void main(String[] args) {
        for(int i =0; i<10; i++)
            Accumulator.add(i);
        Accumulator.showResult();
    }
}
/*
정답 :
class Accumulator {
    static int sum = 0;

    static void add(int n) {
        sum += n;
    }
    static void showResult() {
        System.out.println("sum = " + sum);
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
            Accumulator.add(i);     // 전달되는 값을 모두 누적

        Accumulator.showResult();    // 최종 누적 결과를 출력
    }
}
 */
