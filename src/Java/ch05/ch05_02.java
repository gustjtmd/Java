package Java.ch05;
// if문을 swtich문으로 변경해보자
public class ch05_02 {

    public static void main(String[] args) {

        int n = 24;

        switch (n){
            case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
                System.out.println("0부터 10미만의 수");
                break;
            case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19:
                System.out.println("10부터 20미만의 수");
                break;
            case 20: case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
                System.out.println("20부터 30미만의 수");
                break;
            default:
                System.out.println("음수 혹은 30이상의 수");
        }
    }
}
/* 정답
        int n = 24;

        switch (n/10){
            case 0:
                System.out.println("0부터 10미만의 수");
                break;
            case 1:
                System.out.println("10부터 20미만의 수");
                break;
            case 2:
                System.out.println("20부터 30미만의 수");
                break;
            default:
                System.out.println("음수 혹은 30이상의 수");
 */
