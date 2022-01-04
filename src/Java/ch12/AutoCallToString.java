package Java.ch12;

class Box{
    private String conts;

    Box(String cont){
        this.conts = cont;
    }
    public String toString(){
        return conts;       //문자열 반환
    }
}
public class AutoCallToString {
    public static void main(String[] args) {
        StringBuilder stb = new StringBuilder("12");
        stb.append(34);
        System.out.println(stb.toString());
        System.out.println(stb);

        Box box = new Box("Camera");
        System.out.println(box.toString());
        System.out.println(box);
    }
}
/*
    Box 클래스, StringBuilder클래스에는 문자열을 반환하는 public String toString() 메소드가 정의되어 있음
    인스턴스의 참조 값을 넘겨도 동일한 출력 결과를 확인할 수 있음.
    System.out.println(stb);
    System.out.println(box);
    == System.out.println은 참조 값이 전달되면 이 값의 인스턴스 대상으로 toString 메소드를 호출한다 그리고 이때 반환되는 문자열을 출력
 */

