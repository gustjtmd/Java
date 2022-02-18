package review.ch11;

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
}
