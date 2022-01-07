package Java.ch20;
/*
    자바 5부터 박싱과 언박싱이 필요한 상황에서 이를 자동으로 처리하기 시작함. 이를 오토 박싱 오토 언박싱이라함.
 */
public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        Integer iObj = 10;  //오토박싱
        Double dObj = 3.14; //오토박싱
        System.out.println(iObj);
        System.out.println(dObj);
        System.out.println();

        int num1 = iObj;           //오토언박싱
        double num2 = dObj;        //오토언박싱
        System.out.println(num1);
        System.out.println(num2);
    }
}
