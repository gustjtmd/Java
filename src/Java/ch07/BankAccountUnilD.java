package Java.ch07;
/*
    인스턴스 구분할 수 있는 정보 (계좌번호, 주민번호)주기
 */
class BankAccount4{
    String accNumber; // 계좌번호
    String ssNumber; // 주민번호
    int balance = 0;


    public void intAccount(String acc, String ss, int bal){
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
public class BankAccountUnilD {
    public static void main(String[] args) {
        BankAccount4 yoon = new BankAccount4(); //계좌 생성
        yoon.intAccount("12-34-56","999999-9999999",10000); //초기화

        BankAccount4 park = new BankAccount4();
        park.intAccount("11-11-11","222222-2222222",10000); //초기화

        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withdraw(2000);
        park.withdraw(2000);
        yoon.checkMyBalance();
        park.checkMyBalance();

    }
    /*
        인스턴스의 초기화를 위한 메소드이다.
        때문에 인스턴스 생성시 반드시 한번 호출해서 초기화를 진행해야한다.
     */
}
