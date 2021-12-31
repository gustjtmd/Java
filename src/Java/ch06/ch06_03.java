package Java.ch06;
//인자로 원의 반지름 정보를 전달하면 원의 넓이를 계산해서 반환하는 메소드와 원의 둘레를 계산해서 반환하는 메소드를 각각 정의하고
//이 둘을 호출하는 main 메소드를 정의하자
public class ch06_03 {
    public static void main(String[] args) {
        double oneresult , douleresult;
//        oneresult = one(15);
//        douleresult = doule(15);
        System.out.println("원의 넓이는 : " +one(15));
        System.out.println("둘레의 값은 : " +doule(15));
    }
    public static double one(double x){
        double oneresult = 3.14*x*x;
        return oneresult;
    }
    public static double doule(double x){
        double douleresult = 2*3.14*x;
        return douleresult;
    }

}
/*
정답 :
    {
        System.out.println("원 둘레(2.4): " + calCircleRound(15));
        System.out.println("원 넓이(2.4): " + calCircleArea(15));
    }

    public static double calCircleArea(double rad) {
        final double PI = 3.14;
        return rad * rad * PI;
    }

    public static double calCircleRound(double rad) {
        final double PI = 3.14;
        return rad * 2 * PI;
    }
 */
