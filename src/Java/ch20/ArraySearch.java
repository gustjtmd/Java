package Java.ch20;
/*
    배열의 탐색
    public static int binarySearch(int[] a, int key)
    - 배열 a에서 key를 찾아서 있으면 key의 인덱스 값, 없으면 0보다 작은 수 반환환
    탐색을 위해 이전에 데이터들이 오름차순으로 정렬되어있어야 함.
    */

import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        int[] ar = {33,55,11,44,22};
        Arrays.sort(ar);    //탐색 이전에 정렬이 선행되어야 함.
        for(int n : ar)
            System.out.println(n+"\t");
        System.out.println();

        int idx = Arrays.binarySearch(ar,33);    //배열 ar에서 33을 찾아라
        System.out.println("Index of 33: "+idx);
    }
}
