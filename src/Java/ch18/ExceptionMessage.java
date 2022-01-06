package Java.ch18;
/*
    Throwable 클래스 : 모든 예외 클래스의 최상위 클래스 물론 Throwable도 Object를 상속한다
    Throwable 메소드 둘
    public String getMessage() : 예외의 원인을 담고 있는 문자열을 반환
    public String printStackTrace() : 예외가 발생한 위치와 호출된 메소드 정보를 출력
 */

public class ExceptionMessage {
    public static void md1(int n){
        md2(n,0);   //md2로 부터 예외가 넘어옴
    }
    public static void md2(int n1, int n2){
        int r = n1 / n2;        //예외 발생지점
    }

    public static void main(String[] args) {
        try{
            md1(3); //md1로부터 예외가 넘어옴
        }catch (Throwable e){
            e.printStackTrace();
        }
        System.out.println("Good Bye~");
    }
}
