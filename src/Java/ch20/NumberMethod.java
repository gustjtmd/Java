package Java.ch20;
/*
    앞서 소개한 모든 래퍼 클래스는 다음을 상속한다
    java.lang.Number
    그리고 이 클래스에는 다음의 추상 메소드들이 존재한다(Number도 추상 클래스)
    public abstract int intValue()
    public abstract long longValue()
    public abstract double doubleValue()

    따라서 이를 상속하는 Integer, Double같은 클래스들은 위의 메소드 모두를 구현하고 있다. 때문에 어떠한 래퍼 인스턴스를
    대상으로 인스턴스 저장된 값을 다양한 형태로 반환할 수 있음.
 */

public class NumberMethod {
    public static void main(String[] args) {
        Integer num1 = new Integer(29);
        System.out.println(num1.intValue());    //int형 값으로 반환
        System.out.println(num1.doubleValue()); //double형 값으로 반환

        Double num2 = new Double(3.14);
        System.out.println(num2.intValue());    //int형 값으로 반환
        System.out.println(num2.doubleValue()); //double형 값으로 반환
    }
}
