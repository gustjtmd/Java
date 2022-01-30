package Test;
class Box5{
    public void Wrap(){
        System.out.println("Simple Wrapping");
    }
}
class PaperBox extends Box5{
    public void Wrap(){
        System.out.println("Paper Wrapping");
    }
}

class GoldPaperBox extends PaperBox{
    public void Wrap(){
        System.out.println("Gold Wrapping");
    }
}
public class Wrapping {

    public static void wrapBox(Box5 box){
        box.Wrap();
    }

    public static void main(String[] args) {
        Box5 box1 = new Box5();
        Box5 box2 = new PaperBox();
        Box5 box3 = new GoldPaperBox();

        wrapBox(box1);
        wrapBox(box2);
        wrapBox(box3);
    }
}
