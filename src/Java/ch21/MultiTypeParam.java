package Java.ch21;
/*
    타입 매개변수의 이름은 짓기 나름이다. 그러나 일반적으로 다음 두 가지 규칙을 지켜서 이름을 지음
    - 한 문자로 이름을 짓는다.
    - 대문자로 이름을 짓는다.
 */
class DBox<L,R>{
    private L left; //왼쪽 수납공간
    private R right;//오른쪽 수납공간

    public void set(L o, R r){
        left = o;
        right = r;
    }
    @Override
    public String toString(){
        return left + "&" + right;
    }
}
public class MultiTypeParam {
    public static void main(String[] args) {
        DBox<String, Integer> box = new DBox<String, Integer>();
        box.set("computer",2020);
        System.out.println(box);
    }
}
