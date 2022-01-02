package Java.ch07;
/*
    변수는 저장된 값을 바꿀 수 있다. 그래서 이름이 벼눗이다 마찬가지로 참조변수도 변수이다.
    하나의 인스턴스를 두 개의 참조변수가 함께 참조하는 상황을 예제를 통해서 확인해보자.
 */
class BankAccount2{
    int balance = 0;

    public int deposit(int amount){
        balance += amount;
        return balance;
    }
    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }
    public int checkMyBalance(){
        System.out.println("잔액 : " +balance);
        return balance;
    }
}
public class DupRef {

    public static void main(String[] args) {
        BankAccount2 ref1 = new BankAccount2();
        BankAccount2 ref2 = ref1;

        ref1.deposit(3000);
        ref2.deposit(4000);
        ref1.withdraw(400);
        ref2.withdraw(300);
        ref1.checkMyBalance();
        ref2.checkMyBalance();
    }

}
//실행 결과 두 개의 참조변수 ref1,ref2가 하나의 인스턴스를 참조하고 있음을 확인시켜준다.
