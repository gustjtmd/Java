package Java.ch20;

import java.math.BigDecimal;

/*
    오차 없는 실수의 표현을 위해 BigDecimal 클래스를 사용하자
 */
public class WowBigDecimal {
    public static void main(String[] args) {
        BigDecimal d1 = new BigDecimal("1.6");
        BigDecimal d2 = new BigDecimal("0.1");
        System.out.println("덧셈 결과 : "+ d1.add(d2));
        System.out.println("곱셈 결과 : "+ d1.multiply(d2));
    }
}
