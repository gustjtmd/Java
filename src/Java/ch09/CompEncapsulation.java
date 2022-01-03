package Java.ch09;
/*
    포함 관계로 캡슐화 완성하기
    한 클래스가 다른 클래스 인스턴스 멤버로 가질 수 있는데 이러한 관계를 가리켜 포함관계라 한다.
    그리고 이러한 포함 관계는 캡슐화를 완성하는 과정에서도 사용됨.
 */
class SinivelCap2{
    void take(){
        System.out.println("콧물이 싹~납니다");
    }
}
class SneezeCap2{
    void take(){
        System.out.println("재채기가 멎습니다.");
    }
}
class SnuffleCap2{
    void take(){
        System.out.println("코가 뻥 뚫립니다.");
    }
}

class SinusCap2{
    SinivelCap2 siCap = new SinivelCap2();
    SneezeCap2 szCap = new SneezeCap2();
    SnuffleCap2 sfCap = new SnuffleCap2();

    void take(){
        siCap.take(); szCap.take(); sfCap.take();
    }
}

class ColdPatient3{
    void takeSinus(SinusCap2 cap){
        cap.take();
    }
}

public class CompEncapsulation {
    public static void main(String[] args) {
        ColdPatient3 suf = new ColdPatient3();
        suf.takeSinus(new SinusCap2());
    }
}
