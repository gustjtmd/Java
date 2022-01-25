package review.ch10;

class InstCnt{
    static int instNum = 0; //클래스 변수(static 변수)

    InstCnt(){  //생성자
        instNum++;
        System.out.println("인스턴스 생성 : "+instNum);
    }
}
public class ClassVar {
    public static void main(String[] args) {
        InstCnt cnt1 = new InstCnt();
        InstCnt cnt2 = new InstCnt();
        InstCnt cnn3 = new InstCnt();
    }
}
