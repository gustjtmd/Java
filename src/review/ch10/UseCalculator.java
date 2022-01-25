package review.ch10;

class SimpleCalculator{
    static final double PI = 3.14;

    static double add(double n1, double n2){
        return n1 + n2;
    }
    static double min (double n1, double n2){
        return n1 - n2;
    }
    static double caclCircleArea(double r){
        return PI * r * r;
    }
    static double calCirclePeri(double r){
        return PI * (r * 2);
    }
}
public class UseCalculator {
    public static void main(String[] args) {
        System.out.println("3 + 4 = " + SimpleCalculator.add(3,4));
        System.out.println("반지름 2.2, 원의 넓이 : "+SimpleCalculator.caclCircleArea(2.2));
        System.out.println();
        System.out.println("15 - 7 = "+SimpleCalculator.min(15,7));
        System.out.println("반지름 5.0, 원의 둘레 : "+SimpleCalculator.calCirclePeri(5.0));
    }
}
