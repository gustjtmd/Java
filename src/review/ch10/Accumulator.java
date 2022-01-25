package review.ch10;

public class Accumulator {

    static int result;
    static int add(int n){
        result += n;
        return result;
    }
    static void showResult(){
        System.out.println(result);
    }
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
            Accumulator.add(i);
        Accumulator.showResult();
    }
}


