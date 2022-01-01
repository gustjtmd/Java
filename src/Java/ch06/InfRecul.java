package Java.ch06;

public class InfRecul {
    public static void main(String[] args) {
        showHi(3);
    }
    public static void showHi(int cnt){
        System.out.println("Hi~~");
        if (cnt ==1)
            return;
    //    showHi(cnt--); //cnt의 값이 전달된 다음에 cnt의 값이 감소한다. 따라서 --cnt해야 감소 가능.
    }

}
