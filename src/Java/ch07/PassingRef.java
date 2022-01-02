package Java.ch07;
/*
    메소드를 호출하면서 인스턴스의 참조 값을 전달하는 것도 가능하다
 */
class BankAccount3{
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


public class PassingRef {
    public static void main(String[] args) {
        BankAccount3 ref = new BankAccount3();
        ref.deposit(3000);
        ref.withdraw(300);
        check(ref);
    }
    public static void check(BankAccount3 acc){
        acc.checkMyBalance(); //acc가 참조하는 인스턴스의 메소드 호출
    }
    /*
        위 메소드의 매개변수로 BankAccount의 참조변수가 선언됨 즉 이 메소드는 인자로 인스턴스의 참조 값을 전달받음
        따라서 메소드 내에서는 전달된 참조 값의 인스턴스를 대상으로 메소드를 호출할 수 있음.
     */
}

