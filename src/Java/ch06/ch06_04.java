package Java.ch06;
/*
    전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true를 소수가 아닌 경우 false를 반환하는 메소드를 정의하고
    이 메소드의 호출 결과를 기반으로 1이상 100이하의 소수를 모두 출력하는 main 메소드를 정의하자.
    2시간 넘게 풀다가 도저히 모르겠어서 답봄 그 뒤로 반복하고 이해함
 */
public class ch06_04 {
    public static void main(String[] args) {

    for (int i=1; i<=100; i++){
        if(sosu(i)){
            System.out.println(i);
        }
    }


    }
     public static boolean sosu(int x){
        if(x == 1)
            return false;
        for (int i = 2; i < x; i++){
            if (x%i == 0)
                return false;
        }
         return true;
    }

}
