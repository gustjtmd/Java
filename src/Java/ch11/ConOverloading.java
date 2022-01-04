package Java.ch11;
/*
    한 클래스 내에 동일한 이름의 메소드를 둘 이상 정의하는 것은 허용하지 않으나 매개변수의 선언이 다르면 가능하다
    이것을 메소드 오버로딩이라 한다.
    예 :
    class MyHome{
        void mySimpleRoom(int n){..}
        void mySimpleRoom(int n1, int n2){...}
        void mySimpleRoom(double d1, double d2){...}
    }
    생성자도 오버로딩 대상이 가능하다
 */

class Person{
    private int regiNum; //주민등록 번호
    private int passNum; //여권 번호

    Person(int rnum, int pnum){
        regiNum = rnum;
        passNum = pnum;
    }
    Person(int rnum){
        regiNum = rnum;
        passNum = 0;
    }
    void showPersonalInfo(){
        System.out.println("주민등록 번호 : " +regiNum);

        if(passNum !=0)
            System.out.println("여권 번호 : " +passNum+ '\n');
        else
            System.out.println("여권을 가지고 있지 않습니다.");
    }

}

public class ConOverloading {
    public static void main(String[] args) {
        //여권 있는 사람의 정보를 담은 인스턴스 생성
        Person jung = new Person(335577,112233);
        Person hong = new Person(775544);

        jung.showPersonalInfo();
        hong.showPersonalInfo();
    }
}
/*
    이러한 생성자의 오버로딩은 다양한 상황을 고려한 인스턴스의 생성을 가능하게 함
    여권이 있는 사람의 정보를 담은 인스턴스 뿐 아니라 여권이 없는 사람의 정보를 담은 인스턴스 생성도 가능하게 함.
 */