package Java.ch27;
interface Calculate<T>{
    T cal(T a, T b);
}
public class CalculatorDemo {
    public static <T> void calAndShow(Calculate<T> op, T n1, T n2){
        T r = op.cal(n1, n2);
        System.out.println(r);
    }

    public static void main(String[] args) {
        Calculate<Integer> ci = (a, b) -> a + b;
        Calculate<Double> cd = (a,b) -> a + b;
        Calculate<Integer> ca = (a,b) -> a - b;
        Calculate<Double> cz = (a,b) -> a - b;
        calAndShow(ci,3,4); //3 + 4
        calAndShow(cd,2.5,7.1);    //2.5 + 7.1
        calAndShow(ca,4,2);     //4 - 2
        calAndShow(cz,4.9,3.2); //4.9 - 3.2
    }
}
/*
        // 3 + 4
        calAndShow((a, b) -> a + b, 3, 4);

        // 2.5 + 7.1
        calAndShow((a, b) -> a + b, 2.5, 7.1);

        // 4 - 2
        calAndShow((a, b) -> a - b, 4, 2);

        // 4.9 - 3.2
        calAndShow((a, b) -> a - b, 4.9, 3.2);
 */
