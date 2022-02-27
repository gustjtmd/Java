package review.ch11;

import java.util.Arrays;

class Box2{
    private String conts;

    Box2(String cont){
        this.conts = cont;
    }
    public String toString(){
        return conts;
    }
}
public class ArrayIsInstance2 {
    public static void main(String[] args) {
        Box2[] ar = new Box2[5];  //길이가 5인 Box형 1차원 배열의 생성
        System.out.println("length : "+ar.length);  //length: 5
    }

    public static class ArrayTest2 {

        public static int minValue(int[] arr){
            int result = arr[0];
            for(int i = 0; i < arr.length; i++)
                if(result > arr[i])
                    result = arr[i];
            return result;
        }
        public static int maxValue(int[] arr){
            int result = 0;
            for(int i : arr)
                if(result < i)
                    result = i;
            return result;
        }

        public static void main(String[] args) {
            int[] ar = {10,20,30,40,50};
            System.out.println("최소값 : "+minValue(ar));
            System.out.println("최대값 : "+maxValue(ar));

        }
    }

    public static class ArrayUtils {
        public static void main(String[] args) {
            int[] ar1 = new int[10];
            int[] ar2 = new int[10];

            Arrays.fill(ar1, 7);    //배열 ar1을 7로 초기화
            System.arraycopy(ar1, 0, ar2, 3, 4);
            //배열 ar1을 ar2로 부분 복사

            for(int i = 0; i < ar1.length; i++)
                System.out.print(ar1[i] + " ");
            System.out.println();

            for(int i = 0; i < ar2.length; i++)
                System.out.print(ar2[i] + " ");
        }
    }
}
