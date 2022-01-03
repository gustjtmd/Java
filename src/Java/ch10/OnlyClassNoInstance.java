package Java.ch10;
/*
    클래스 변수는 인스턴스의 생성과 상관이 없다고 하였다. 그러면 클래스 변수는 언제 메모리 공간에 할당되고 초기화되는지 알아보자
 */

class InstCnt2{
    static int instNum = 100;

    InstCnt2(){
        instNum++;
        System.out.println("인스턴스 생성 : ");
    }
}

public class OnlyClassNoInstance {
    public static void main(String[] args) {
        InstCnt2.instNum -= 15;  //인스턴스 생성 없이 instNum에 접근
        System.out.println(InstCnt2.instNum);
    }
}
/*
    클래스 변수는 인스턴스 생성 이전에 메모리 공간에 존재한다
    클래스 변수는 해당 클래스 정보가 가상머신에 의해 일깋는 순간 메모리 공간에 할당되고 초기화된다.


 */
