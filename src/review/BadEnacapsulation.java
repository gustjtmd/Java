package review;

class SinivelCap{   //콧물 처치
    void take(){
        System.out.println("콧물이 낫습니다");
    }
}
class SneezeCap{    //재채기 처치
    void take(){
        System.out.println("재채기가 멎습니다.");
    }
}
class SnuffleCap{   //기침 처치
    void take(){
        System.out.println("기침이 멈춥니다.");
    }
}

class ColdPatient{
    void takeSinivelCap(SinivelCap cap){
        cap.take();
    }
    void takeSneezeCap(SneezeCap cap){
        cap.take();
    }
    void takeSnuffleCap(SnuffleCap cap){
        cap.take();
    }
}
public class BadEnacapsulation {
    public static void main(String[] args) {
        ColdPatient suf = new ColdPatient();

        suf.takeSinivelCap(new SinivelCap());
        suf.takeSneezeCap(new SneezeCap());
        suf.takeSnuffleCap(new SnuffleCap());
    }
}
