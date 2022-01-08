package Java.ch21;

/*
    제네릭 이전의 코드 : 사과와 오렌지를 담는 상자를 각각 생성하여 그 상자에 사과와 오렌지를 담았다가 꺼내는 과정
 */

class Apple{    //사과를 단순히 표현한 클래스
    public String toString(){
        return "I am an apple.";
    }
}
class Orange{   // 오렌지를 단순히 표현한 클래스
    public String toString(){
        return "I am an orange.";
    }
}
class AppleBox{ //사고 담는 상자를 표현한 클래스
    private Apple ap;

    public void set(Apple a){   //사과를 담는다
        ap  = a;
    }
    public Apple get(){ //사과를 꺼낸다
        return ap;
    }
}
class OrangeBox{    //오렌지 담는 상자를 표현한 클래스
    private Orange og;

    public void set(Orange o){      //오렌지를 담는다
        og = o;
    }
    public Orange get(){    //오렌지를 꺼낸다
        return og;
    }
}
public class FruitAndBox {
    public static void main(String[] args) {
        AppleBox abox = new AppleBox(); //사과 상자 생성
        OrangeBox obox = new OrangeBox();   //오렌지 상자 생성

        abox.set(new Apple());  //사과를 사과 상자에 담는다
        obox.set(new Orange()); //오렌지를 오렌지 상자에 담는다

        Apple ap = abox.get();  //상자에서 사과를 꺼낸다
        Orange og  = obox.get();//상자에서 오렌지를 꺼낸다
        System.out.println(ap);
        System.out.println(og);

    }
}
