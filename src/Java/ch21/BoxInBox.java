package Java.ch21;
/*
    타입 매개변수화 타입을 타입 인자로 전달
    상자를 하나 생성하여 그 안에  문자열을 저장한 다음에 이 상자를 다른 상자에 넣고자 한다. 그리고 이 상자를 한번 더 다 른 상자에 넣을 생각이다
    이는 하나의 문자열을 세 개의 상자로 겹겹이 포장하는 셈
 */
class Box5<T>{
    private T ob;

    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}

public class BoxInBox {
    public static void main(String[] args) {
        Box5<String> sbox = new Box5<>();
        sbox.set("I am So Happy");

        Box5<Box5<String>> wBox = new Box5<>();
        wBox.set(sbox);

        Box5<Box5<Box5<String>>> zBox = new Box5<>();
        zBox.set(wBox);

        System.out.println(zBox.get().get().get());
    }
}
