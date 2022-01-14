package Java.ch28;

import java.util.function.ToIntBiFunction;

class Ibox{
    private int n;
    public Ibox(int i){n = i;}
    public int larger(Ibox b){
        if(n>b.n)
            return n;
        else
            return b.n;
    }
}
public class NoObjectMethodRef {
    public static void main(String[] args) {
        Ibox ib1 = new Ibox(5);
        Ibox ib2 = new Ibox(7);

        //두 상자에 저장된 값 비교하여 더 큰 값 반환
    //  ToIntBiFunction<Ibox,Ibox> bf = (b1,b2) -> b1.larger(b2);
        ToIntBiFunction<Ibox,Ibox> bf = Ibox::larger;
        int bigNum = bf.applyAsInt(ib1,ib2);
        System.out.println(bigNum);
    }
}
