package Java.ch13;
/*
    배열은 int, double과 같은 기본 자료형을 대상으로만 생성할 수 있는 것이 아니다.
 */

class Box{
    private String conts;

    Box(String cont){
        this.conts = cont;
    }
    public String toString(){
        return conts;
    }
}

public class ArrayIsInstace2 {
    public static void main(String[] args) {
        Box[] ar = new Box[5];  //길이가 5인 Box형 1차원 배열의 생성
        System.out.println("length : " + ar.length);
    }
}
/*
    Box클래스를 정의하고 이 클래스의 인스턴스 5개를 저장할 수 있는 배열을 생성하였다.
    Box인스턴스 5개를 저장할 수 있는 참조변수의 배열
 */
