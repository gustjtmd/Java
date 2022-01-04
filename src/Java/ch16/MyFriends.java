package Java.ch16;
/*
    상속은 연관된 일련의 클래스들에 공통적인 규약을 정의할 수 있음
 */
class Friend{
    protected String name;
    protected String phone;

    public Friend(String na, String ph){
        this.name = na;
        this.phone = ph;
    }
    public void showInfo(){
        System.out.println("이름 : "+ name);
        System.out.println("전화 : "+ phone);
    }
}
class UnivFriend extends Friend{
    private String major;

    public UnivFriend(String na, String ph, String ma){
        super(na,ph);
        this.major = ma;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("전공 : " + major);
    }
}

class ComFriend extends Friend{
    private String department;

    public ComFriend(String na, String ph, String de){
        super(na,ph);
        this.department = de;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("부서 : "+department);
    }
}

public class MyFriends {
    public static void main(String[] args) {
        Friend[] frns =  new Friend[10];
        int cnt = 0;

        frns[cnt++] = new UnivFriend("LEE","010-1111-1111","Computer");
        frns[cnt++] = new UnivFriend("SEO","010-2222-2222","Math");
        frns[cnt++] = new ComFriend("KIM","010-3333-3333","KAKAO");
        frns[cnt++] = new ComFriend("SHIN","010-4444-4444","MUZIK");

        for(int i =0; i<cnt;i++){
            frns[i].showInfo();
            System.out.println();
        }
    }
}
/*
    UnivFrind클래스와 CompFriend 클래스가 Friend 클래스를 상속하게 함으로써
    1. 인스턴스를 저장하는 배열이 하나이다 : Friend 클래스를 상속하는 클래스가 더 추가되어도 이 사실은 변함이 없다
    2. 정보를 젖아하는 과정이 나뉘지 않는다 : 하나의 배열에 모든 인스턴스를 저장할 수 있다.
    3. 저장된 정보를 모두 출력할 때 하나의 for문으로 충분하다 : 하나의 배열이 사용되었고 또 메소드 오버라이딩이 도움이 되었다.

    Friend 클래스는 재활용된 클래스가 아닌 UnivFriend 클래스와 CompFriend클래스에 공통 규약을 적용하기 위해 정의된 클래스.
 */