package Java.ch14;
/*
    하위 클래스의 생성자에서 상위 클래스의 생성자를 명시적으로 호출하지 않으면 인자를 받지 않는 생성자가 자동으로 호출된다.
    상위 클래스의 생성자는 어떻게 명시적으로 호출을 할까?
 */
class SuperCLS2{
    public SuperCLS2(){
        System.out.println("Con : SuperCLS()");
    }
    public SuperCLS2(int i){
        System.out.println("Con : SuperCLS(int i)");
    }
    public SuperCLS2(int i,int j){
        System.out.println("Con : SuperCLS(int i, int j)");
    }
}

class SubCLS2 extends SuperCLS2{
    public SubCLS2(){
        System.out.println("Con : SubCLS()");
    }
    public SubCLS2(int i){
        super(i);   //상위 클래스의 생성자를 지정 및 호출
        System.out.println("Con : SubCLS(int i)");
    }
    public SubCLS2(int i, int j){
        super(i,j); //상위 클래스의 생성자를 지정 및 호출
        System.out.println("Con : SubCLS(int i, int j)");
    }
}

public class SuperSubCon2 {
    public static void main(String[] args) {
        System.out.println("1. ");
        new SubCLS2();
        System.out.println();

        System.out.println("2.");
        new SubCLS2(1);
        System.out.println();

        System.out.println("3.");
        new SubCLS2(1,2);
        System.out.println();
    }
}
/*
    super는 상위 클래스의 생성자 호출을 의미함
    만약 하위 클래스에서 상위 클래스의 생성자 호출을 생략하면
    자동으로 삽입되게 되어있음.
 */