package Java.ch11;
/*
    this를 활용해보자
 */
class SimpleBox{
    private int data;

    SimpleBox(int data){
        this.data = data;
    }
    void setData(int data){
        this.data = data;
    }
    int getData(){
        return this.data;
    }
}

public class ThisInst {
    public static void main(String[] args) {
        SimpleBox box = new SimpleBox(99);
        System.out.println(box.getData());

        box.setData(77);
        System.out.println(box.getData());
    }
}
/*
    this.data에서 this가 의미하는 것은 '이 문장이 속한 인스턴스'이다. 따라서 this.data는 인스턴스 변수 data를 의미하는것이 된다.

 */
