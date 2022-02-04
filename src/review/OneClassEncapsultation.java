package review;


import Test.arrtest2;

class ColdPatient2{
    void takeCap(arrtest2.SinusCap2 cap){
        cap.take();
    }
}

public class OneClassEncapsultation {
    public static void main(String[] args) {
        ColdPatient2 coldPatient2 = new ColdPatient2();
        coldPatient2.takeCap(new arrtest2.SinusCap2());
    }
}
