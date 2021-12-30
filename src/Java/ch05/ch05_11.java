package Java.ch05;
/*
    다음 식을 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성하자
    A B
 +  B A
 ---------
    9 9
 */
public class ch05_11 {
    public static void main(String[] args) {
        for(int y=1; y<10; y++){
            for(int x=1;x<10;x++){
                if((y*10+x)+(y+x*10) == 99) {
                    System.out.printf("%d %d\n",y,x);
                }
            }
        }
    }
}
/*
정답
        {
		for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                if((i * 10 + j) + (j * 10 + i) == 99)
                    System.out.println(i + ", " + j);
            }
        }
    }
 */