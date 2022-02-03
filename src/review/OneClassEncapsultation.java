package review;


class SinusCap2{
    void sniTake(){
        System.out.println("콧물이 낫습니다.");
    }
    void sneTake(){
        System.out.println("재채기가 멎습니다.");
    }
    void snuTake(){
        System.out.println("기침이 멈춥니다.");
    }
    void take(){
        sniTake();
        sneTake();
        snuTake();
    }
}

class ColdPatient2{
    void takeCap(SinusCap2 cap){
        cap.take();
    }
}

public class OneClassEncapsultation {
    public static void main(String[] args) {
        ColdPatient2 coldPatient2 = new ColdPatient2();
        coldPatient2.takeCap(new SinusCap2());
    }
}
