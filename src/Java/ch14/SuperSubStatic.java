package Java.ch14;

class SuperCLS3{
    protected static int count = 0; //protected는 하위 클래스 접근을 허용

    public SuperCLS3(){
        count++;
    }
}

class SubCLS3 extends SuperCLS3{
    public void showCount(){
        //상위 클래스에 위치한 클래스 변수 count에 접근
        System.out.println(count);
    }
}

public class SuperSubStatic {
    public static void main(String[] args) {
        SuperCLS3 obj1 = new SuperCLS3();   //count값 1 증가
        SuperCLS3 obj2 = new SuperCLS3();   //count값 1 증가

        SubCLS3 obj3 = new SubCLS3();   //count값 1 증가
        obj3.showCount();
    }
}
/*
    변수의 이름만으로도 접근이 가능하다 상위 클래스와 마찬가지로 이를 상속하는 하위 클래스에서도 이름만으로 클래스 변수와
    클래스 메소드에 접근이 가능하다 private면 불가능
     */