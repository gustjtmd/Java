package Java.ch20;

public class UseWrapperClass {
    public static void showData(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Integer iInst = new Integer(3);
        showData(iInst);
        showData(new Double(7.15));
    }
}
/*
    래퍼 클래스의 두 가지 기능
    1. 값을 인스턴스로 감싸는것
    2. 인스턴스에서 값을 꺼내는 것

 */