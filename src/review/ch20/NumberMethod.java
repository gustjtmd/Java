package review.ch20;

public class NumberMethod {
    public static void main(String[] args) {
        Integer num1 = new Integer(29);
        System.out.println(num1.intValue());    //int형 값으로 반환
        System.out.println(num1.doubleValue()); //double형 값으로 반환
        System.out.println();

        Double num2 = new Double(3.14);
        System.out.println(num2.intValue());    //int형 값으로 반환
        System.out.println(num2.doubleValue()); //double형 값으로 반환
    }
}
