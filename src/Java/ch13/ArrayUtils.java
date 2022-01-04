package Java.ch13;

import java.util.Arrays;

/*
    int[] ar = new int[10]; -> 배열의 모든 요소 0으로 초기화
    String[] ar = new String[10] -> 배열의 모든 요소 null로 초기화

    0 이외의 값으로 초기화 할때
    public static void fill(int[] a,int val) -> 두 번째 인자로 전달된 값으로 배열 초기화

    public static void fill(int[] a, int fromIndex, int toindex, int val)
    -> 인덱스 fromIndex~(toIndex-1)의 범위까지 val의 값으로 배열 초기화

    public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
    -> 복사 원본의 위치 : 배열 src의 인덱스 srcPos
    복사 대상의 위치 : 배열 dest의 인덱스 destPos
    복사할 요소의 수 : length

 */
public class ArrayUtils {
    public static void main(String[] args) {
        int[] ar1 = new int[10];
        int[] ar2 = new int[10];

        Arrays.fill(ar1, 7);    //배열 ar1을 7로 초기화
        System.arraycopy(ar1,0,ar2,3,4);    //배열 ar1을 ar2로 부분 복사

        for(int i=0; i < ar1.length; i++)
            System.out.print(ar1[i]+" ");
        System.out.println();

        for(int i = 0; i< ar2.length; i++)
            System.out.print(ar2[i]+ " ");

    }
}
