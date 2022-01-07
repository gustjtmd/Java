package Java.ch20;

import java.util.Arrays;

class INum{
    private int num;
    public INum(int num){
        this.num = num;
    }
}
public class ArrayObjEquals {
    public static void main(String[] args) {
        INum[] ar1 = new INum[3];
        INum[] ar2 = new INum[3];
        ar1[0] = new INum(1); ar2[0] = new INum(1);
        ar1[1] = new INum(2); ar2[1] = new INum(2);
        ar1[2] = new INum(3); ar2[2] = new INum(3);
        System.out.println(Arrays.equals(ar1,ar2));
    }
}
/*
    Object클래스에 정의되어 있는 equals 메소드는
    public boolean equals(Object obj){
        if(this == obj) //두 인스턴스가 동일 인스턴스이면
            return true;
        else
            return false;
    }   이렇든 Object 클래스에 정의된 equals 메소드는 참조 값 비교를 한다.
 */