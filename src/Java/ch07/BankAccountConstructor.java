package Java.ch07;
/*
    생성자는 메소드 모습과 같다 하지만 다음와 같은 차이가 있다
    - 생성자의 이름은 클래스의 이름과 동일해야 한다.
    - 생성자는 값을 반환하지 않고 반황혀도 표시하지 않는다.
 */
class BankAccount5{
    String accNumber; // 계좌번호
    String ssNumber; // 주민번호
    int balance = 0;


    public BankAccount5(String acc, String ss, int bal){ //생성자
        accNumber = acc;
        ssNumber = ss;
        balance = bal; //계좌 개설시 예금액으로 초기화
    }
    public int deposit(int amount){
        balance += amount;
        return balance;
    }
    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }
    public int checkMyBalance(){
        System.out.println("계좌번호 : " + accNumber);
        System.out.println("주민번호 : " + ssNumber);
        System.out.println("잔액 : "+balance+ '\n');
        return balance;
    }
}

public class BankAccountConstructor {
    public static void main(String[] args) {

        BankAccount5 yoon = new BankAccount5("11-22-33","111111-1111111",10000);
        BankAccount5 park = new BankAccount5("99-88-77","999999-9999999",10000);

        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withdraw(2000);
        park.withdraw(2000);
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}
/*
    인스턴스 생성의 마지막 단계는 생성자 호출이다.
    어떠한 이유로든 생성자 호출이 생략된 인스턴스는 인스턴스가 아니다.
    생성자를 생략한 상태의 클래스를 정의하면 자바 컴파일러가 디폴트 생성자라는것을 클래스에 정의해준다.
    
 */