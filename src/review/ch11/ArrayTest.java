package review.ch11;

public class ArrayTest {

    static int sumOfAry(int[] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++)
            sum += arr[i];
        return sum;
    }

    static int[] makeNewIntAry(int len){
        int[] ar = new int[len];
        return ar;
    }

    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,7};
        int sum = sumOfAry(ar);
        System.out.println("1부터 7까지의 합 : "+ sum);

        int[] arr = makeNewIntAry(100);
        System.out.println("arr의 길이 : "+ arr.length);
    }

}
