package Java.ch10;
/*
    클래스 변수에 접근하는 방법은 접근 영역을 기준으로 다음과 같이 크게 두 가지로 나뉜다.
    - 클래스 내부 접근 : 변수의 이름을 통해 직접 접근
    = 클래스 외부 접근 : 클래스 또는 인스턴스의 이름을 통해 접근
 */

class AccessWay{
    static int num = 0;

    AccessWay(){
        incrCnt();
    }
    void incrCnt(){
        num++; //클래스 내부에서 이름을 통한 접근
    }
}

public class ClassVarAccess {
    public static void main(String[] args) {
        AccessWay way = new AccessWay();
        way.num++;      //외부에서 인스턴스의 이름을 통한 접근.
        AccessWay.num++;    //외부에서 클래스의 이름을 통한 접근
        System.out.println("num = " + AccessWay.num);
    }
}
