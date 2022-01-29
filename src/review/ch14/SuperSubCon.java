package review.ch14;

class SuperCLS2{
    public SuperCLS2(){  //생성자
        System.out.println("I'm Super Class");
    }
}
class SubCls2 extends SuperCLS2 {
    public SubCls2(){
        System.out.println("I'm Sub Class");
    }
}
public class SuperSubCon {
    public static void main(String[] args) {
        new SubCls2();
    }
}
