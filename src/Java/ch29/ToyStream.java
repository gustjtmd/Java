package Java.ch29;

import java.util.ArrayList;
import java.util.List;

class ToyPriceInfo{ //장난감 모델 별 가격 정보
    private String model;   //모델 명
    private int price;  //가격

    public ToyPriceInfo(String m, int p){
        model = m;
        price = p;
    }
    public int getPrice(){
        return price;
    }
    public String getModel(){return model;}
}
public class ToyStream {
    public static void main(String[] args) {
        List<ToyPriceInfo> ls = new ArrayList<>();
        ls.add(new ToyPriceInfo("Gun_LR_45",200));
        ls.add(new ToyPriceInfo("TEDDY_BEAR_S_014",350));
        ls.add(new ToyPriceInfo("CAR_TRASFORM_VER_7719",550));

        ls.stream().filter(s -> s.getModel().length() > 10)
                .map(s -> s.getModel())
                .forEach(s -> System.out.println(s));

    }
}
