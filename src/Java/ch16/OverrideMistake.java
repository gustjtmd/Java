package Java.ch16;

class ParentAdder{
    public int add(int a, int b){
        return a+b;
    }
}
class ChildAdder extends ParentAdder{
   @Override
    public double add(double a, double b){
        System.out.println("덧셈을 진행합니다.");
        return a + b;
    }
}

public class OverrideMistake {
    public static void main(String[] args) {
        ParentAdder adder = new ChildAdder();
        System.out.println(adder.add(3,4));
    }

}
/*
    메소드의 매개변수 형과 반환형이 달랐기 때문에 오버라이딩 되지 않았다
    이를 컴파일 과정에서 실수를 확인하기 위해 어노테이션 @Override를 확용한다.
 */