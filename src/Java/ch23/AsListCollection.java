package Java.ch23;

import java.util.*;

public class AsListCollection {
    public static void main(String[] args) {
        //List<E>는 collection<E>를 상속한다.
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
        //생성자 public ArrayList(Collection<? extends E> c)를 통한 인스턴스 생성
        list = new ArrayList<>(list);

        //for문 기반의 반복자 획득과 순차적 참조
        for(Iterator<String> itr = list.iterator(); itr.hasNext();)
             System.out.print(itr.next() + '\t');
        System.out.println();

        // "Box"를 삭제하기 위한 반복문
        for(Iterator<String> itr = list.iterator(); itr.hasNext();){
            if(itr.next().equals("Box"))
                itr.remove();
        }
        for(Iterator<String> itr = list.iterator(); itr.hasNext();)
            System.out.print(itr.next() + '\t');
        System.out.println();


    }
}
