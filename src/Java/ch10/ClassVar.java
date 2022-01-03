package Java.ch10;

/*
    선언된 클래스의 모든 인스턴스가 공유하는 클래스 변수(static 변수)
    클래스 내에 선언된 변수 앞에 static 선언을 붙이면 이는 인스턴스 변수가 아닌 클래스 변수가 된다.
 */

class InstCnt{
    static int instNum = 0; //클래스 변수( static 변수)

    InstCnt(){      //생성자
        instNum++;  //static으로 선언된 변수와 값 증가
        System.out.println("인스턴스 생성 : " + instNum);

    }
}

public class ClassVar {
    public static void main(String[] args) {
        InstCnt cnt1 = new InstCnt();
        InstCnt cnt2 = new InstCnt();
        InstCnt cnt3 = new InstCnt();
    }
}
/*
    static으로 선언된 변수는 변수가 선언된 클래스의 모든 인스턴스가 공유하는 변수이다.
 */