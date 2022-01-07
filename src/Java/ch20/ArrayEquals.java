package Java.ch20;

import java.util.Arrays;

public class ArrayEquals {
    public static void main(String[] args) {
        int[] ar1 = {1,2,3,4,5};
        int[] ar2 = Arrays.copyOf(ar1,ar1.length);
        System.out.println(Arrays.equals(ar1,ar2));
    }
}
/*
    public static boolean equals(int[] a, int[] a2)
    매개변수 a와 a2로 전달된 배열의 내용을 비교하여 true 또는 false 반환.
    이 메소드는 Object 배열에 대해서도 오버로딩 되어있다
    public static boolean equals(Object[] a, Object[] a2)
 */