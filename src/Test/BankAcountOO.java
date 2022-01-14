package Test;

class BankAccount{
    String accNumber;   //계좌번호
    String ssNumber;    //주민번호
    int balance = 0;    //예금 잔액

    public BankAccount(String acc, String ss, int bal){
        accNumber = acc;
        ssNumber = ss;
        balance = bal;
    }

    public int deposit(int amount){
        balance += amount;
        return balance;
    }
    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }
    public int checkMyBalace(){
        System.out.println("계좌 번호 : " +accNumber);
        System.out.println("주민번호 : "+ ssNumber);
        System.out.println("잔액 : " +balance);
        return balance;
    }
}

public class BankAcountOO {
    public static void main(String[] args) {
        BankAccount yoon = new BankAccount("11-11-11","999999-9999999",10000);
        BankAccount park = new BankAccount("22-22-22","999999-9999991",10000);
        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withdraw(2000);
        park.withdraw(2000);
        check(yoon);
        check(park);
    }
    public static void check(BankAccount acc){
        acc.checkMyBalace();
    }
}
