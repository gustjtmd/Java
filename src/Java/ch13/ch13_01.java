package Java.ch13;
/*
    int형 1차원 배열을 매개변수로 전달받아서 배열에 저장된 최댓값, 최솟값을 찾아서 반환하는 메소드를 각각 다음의 형태로 정의하자

    단 반복문을 사용할때 minValue의 정의에서는 일반적인 for문을 사용하고 maxValue의 정의에서는 새로운 for문을 사용하기로 하자.
 */

import java.util.Arrays;

class result {
    public static int maxValue(int[] arr){
        int max = arr[0];

        for(int i =0; i<arr.length; i++){
            if (max<arr[i])
                max=arr[i];
        }
        return max;
    }
    public static int minValue(int[] arr){
        int min = arr[0];

        for(int e : arr){
            if (min > e)
                min = e;
        }
        return min;
    }
}

public class ch13_01 {
    public static void main(String[] args) {
        int[] arr = {30,40,50,60,70};
        System.out.println(result.maxValue(arr));
        System.out.println(result.minValue(arr));
    }
}
