package Java.ch05;
//구구단의 짝수단인 2,4,6,8단만 출력하는 프로그램을 작성하되 2단은 2X2까지 4단은 4X4까지 6단은 6X6까지 8단은 8X8까지 출력하도록 작성하자
public class ch05_10 {
    public static void main(String[] args) {
        for(int i =1; i<=9;i++){
            for (int x=1;x<=9;x++){
                if (i%2 ==0){
                    System.out.println(i+"*"+x+"="+i*x);
                    if (i==x){
                        break;
                    }
                }
            }
        }
    }
}
/*
        for(int i = 2; i < 10; i += 2) {
            for(int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));

                if(j >= i)
                    break;
            }
        }
    }
 */
