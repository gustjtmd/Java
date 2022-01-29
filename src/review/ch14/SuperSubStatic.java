package review.ch14;
class SuperCL{
    private static int count = 0; //protected는 하위 클래스의 접근을 허용한다.

    public SuperCL(){
        count++;
    }
    public void showCount(){
        System.out.println(count);
    }
}
class SubCL extends SuperCL{
    public void showCount(){
        //상위 클래스에 위치한 클래스 변수 count에 접근
  //      System.out.println(count);
    }
}
public class SuperSubStatic {
    public static void main(String[] args) {
        SuperCL obj1 = new SuperCL(); //count값 1 증가
        SuperCL obj2 = new SubCL(); //count값 1 증가

        // 아래 인스턴스 생성 과정에서 SuperCL 생성자 호출되므로
        SubCL obj3 = new SubCL();   // count값 1 증가
        obj1.showCount();
    }
}
