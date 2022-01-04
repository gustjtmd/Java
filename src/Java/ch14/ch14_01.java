package Java.ch14;
/*
    다음 클래스 각각에 적절한 생성자를 삽입해보자 물론 상속 관계를 고려하여 각 클래스 별로 필요한 생성자를 삽입해야 한다.
 */
class Car{  //기본 연료 자동차
    int gasolineGauge;  //가솔린 잔여량

    public Car(int ga){
        this.gasolineGauge = ga;
    }
}

class HybridCar extends Car{    //하이브리드 자동차
    int electricGauge;  //전기배터리 잔여량

    public HybridCar(int gasolineGauge, int ele){ //하이브리드 워터카
        super(gasolineGauge);   //에너지 전환용 물의 잔여량
        this.electricGauge = ele;
    }
}

class HybridWaterCar extends HybridCar{
    int waterGauge;

    public HybridWaterCar(int gasoline, int electric, int water){
        super(gasoline,electric);
        this.waterGauge = water;
    }

    public void showCurrentGauge(){
        System.out.println("잔여 가솔린 : "+ gasolineGauge);
        System.out.println("잔여 전기량 : "+ electricGauge);
        System.out.println("잔여 워터량 : "+ waterGauge);
    }
}



public class ch14_01 {
    public static void main(String[] args) {
        HybridWaterCar hy = new HybridWaterCar(30,40,50);
        hy.showCurrentGauge();
    }
}
/*
    답
    class Car {      // 기본 연료 자동차
    int gasolineGauge;

    public Car(int oil) {
        gasolineGauge = oil;
    }
}

class HybridCar extends Car {    // 하이브리드 자동차
    int electricGauge;

    public HybridCar(int oil, int ele) {
        super(oil);
        electricGauge = ele;
    }
}

class HybridWaterCar extends HybridCar {    // 하이브리드 워터카
    int waterGauge;

    public HybridWaterCar(int oil, int ele, int wat) {
        super(oil, ele);
        waterGauge = wat;
    }

    public void showCurrentGauge() {
        System.out.println("잔여 가솔린: " + gasolineGauge);
        System.out.println("잔여 전기량: " + electricGauge);
        System.out.println("잔여 워터량: " + waterGauge);
    }
}

class ConstructorAndSuper {
    public static void main(String[] args) {
        HybridWaterCar hwCar1 = new HybridWaterCar(4, 2, 3);
        hwCar1.showCurrentGauge();

        HybridWaterCar hwCar2 = new HybridWaterCar(9, 5, 7);
        hwCar2.showCurrentGauge();
    }
}
 */