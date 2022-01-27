package review.ch13;

public class ArrayTest2 {

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
