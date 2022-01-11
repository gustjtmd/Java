package Java.ch24;

import java.util.*;

class Car2 implements Comparable<Car2>{
    protected int disp; //배기량

    public Car2(int d){disp = d;}

    @Override
    public String toString(){
        return "cc: disp";
    }
    @Override
    public int compareTo(Car2 o){
        return disp - o.disp;
    }
}

class Ecar2 extends Car2{    //전기 자동차를 표현한 클래스
    private int battery;    //배터리

    public Ecar2(int d, int b){
        super(d);
        battery = b;
    }
    @Override
    public String toString() {
        return "cc : " + disp + ", ba: " + battery;
    }
}
public class EcarSortCollections {
    public static void main(String[] args) {
        List<Ecar2> list = new ArrayList<>();
        list.add(new Ecar2(1200,99));
        list.add(new Ecar2(3000,55));
        list.add(new Ecar2(1800,87));

        Collections.sort(list); //정렬

        for(Iterator<Ecar2> itr = list.iterator(); itr.hasNext();)  //출력
            System.out.println(itr.next().toString() +'\t');

    }
}
