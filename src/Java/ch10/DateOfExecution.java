package Java.ch10;

import java.time.LocalDate;

/*
    static 초기화 블록은 클래스 변수와 마찬가지로 가상머신이 클래스의 정보를 읽어 들일때(가상머신이 클래스를 로딩할때)
    실행이 된다. 따라서 다음과 같이 static 초기화 블록을 사용하면 클래스 변수를 선언과 동시에 초기화 할 수 있다.
 */
class DateOfExecution {
    static String date;

    static {    //클래스 로딩시 단 한번 실행이 되는 영역
        LocalDate nDate = LocalDate.now();
        date = nDate.toString();
    }

    public static void main(String[] args) {
        System.out.println(date);
    }
}
