package review.ch13;

class Box2{
    private String conts;

    Box2(String cont){
        this.conts = cont;
    }
    public String toString(){
        return conts;
    }
}
public class ArrayIsInstance2 {
    public static void main(String[] args) {
        Box2[] ar = new Box2[5];  //길이가 5인 Box형 1차원 배열의 생성
        System.out.println("length : "+ar.length);  //length: 5
    }
}
