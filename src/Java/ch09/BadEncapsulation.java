package Java.ch09;
//캡슐화가 이뤄지지 않은 예제

class SinivelCap{ //콧물 처치용 캡슐
    void take(){
        System.out.println("콧물이 싹~납니다");
    }
}
class SneezeCap{ //재채기 처치용 캡슐
    void take() {
        System.out.println("재채기가 멎습니다.");
    }
}
class SnuffleCap{ //코막힘 처치용 캡슐
    void take(){
        System.out.println("코가 뻥 뚫립니다.");
    }
}
class ColdPatient{
    void takeSinivelCap(SinivelCap cap){
        cap.take();
    }
    void takeSnnezeCap(SneezeCap cap){
        cap.take();
    }
    void takeSnuffleCap(SnuffleCap cap){
        cap.take();
    }
}

public class BadEncapsulation {
    public static void main(String[] args) {
        ColdPatient suf = new ColdPatient();

        //콧물 캡슐 구매 후 복용
        suf.takeSinivelCap(new SinivelCap());

        //재채기 캡슐 구매 후 복용
        suf.takeSnnezeCap(new SneezeCap());

        //코막힘 캡슐 구매 후 복용
        suf.takeSnuffleCap(new SnuffleCap());
    }

}
