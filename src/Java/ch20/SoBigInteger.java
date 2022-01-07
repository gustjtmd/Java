package Java.ch20;
/*
    정수 자료형 중에서 가장 표현 범위가 넓은 long형으로도 표현 불가능한 수를 표현해야 할 때가 있음. 그러한 경우에 BigInteger 클래스를 사용하면됨.
 */
import java.math.BigInteger;

public class SoBigInteger {
    public static void main(String[] args) {
        //long형으로 표현 가능한 값의 크기 출력
        System.out.println("최대 정수 : " + Long.MAX_VALUE);
        System.out.println("최소 정수 : " + Long.MIN_VALUE);

        //매우 큰 수를 BigInteger 인스턴스로 표현 ""로 하는 이유는 ""를 안 하면 컴파일러가 정수로 판단해 표현 범위가 벗어낫다 생각해 에러처리 하기떄문
        BigInteger big1 = new BigInteger("1000000000000000000");
        BigInteger big2 = new BigInteger("-999999999999999999");

        //BigInteger 기반 덧셈 연산
        BigInteger r1 = big1.add(big2);
        System.out.println("덧셈 결과 : "+r1);

        //BigInteger 기반 곱셈 연산
        BigInteger r2 = big1.multiply(big2);
        System.out.println("곱셈 결과 : "+ r2);
        System.out.println();

        //인스턴스에 저장된 값을 int형 정수로 반환
        int num =  r1.intValueExact();
        System.out.println("From BigInteger " + num);
    }
}
