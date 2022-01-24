package review;

class SinivelCap5{
    void take(){
        System.out.println("콧물이 낫습니다");
    }
}
class SneezeCap5{
    void take(){
        System.out.println("재채기가 멎습니다.");
    }
}
class SnuffleCap5{
    void take(){
        System.out.println("기침이 멈춥니다");
    }
}

class SinusCap5{
    SinivelCap5 sicap = new SinivelCap5();
    SneezeCap5 szCap = new SneezeCap5();
    SnuffleCap5 sfCap = new SnuffleCap5();

    void take(){
        sicap.take();szCap.take();sfCap.take();
    }
}

public class CompEncapsultation {
    public static void main(String[] args) {
        SinusCap5 sinusCap = new SinusCap5();
        sinusCap.take();
    }
}
