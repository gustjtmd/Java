package review.ch15;
class Friend{
    private String name;
    private String phone;

    public Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public void showInfo(){
        System.out.println("이름 : " +name);
        System.out.println("전화번호 : "+phone);
    }
}
class UnivFriend extends Friend{
    private String major;  //전공

    public UnivFriend(String name, String phone, String major) {
        super(name, phone);
        this.major = major;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("전공 : "+major);
    }
}

class CompFriend extends Friend{
    private String department;  //부서

    public CompFriend(String name, String phone, String department) {
        super(name, phone);
        this.department = department;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("부서 : "+department);
    }
}
public class MyFriends2 {
    public static void main(String[] args) {
        Friend[] frns = new Friend[10];
        int fcns = 0;

        frns[fcns++] = new UnivFriend("Lee","010-111-111","Computer");
        frns[fcns++] = new UnivFriend("SEO","010-222-222","Electronics");
        frns[fcns++] = new CompFriend("Yoon","02-111-111","R&D1");
        frns[fcns++] = new CompFriend("PARK","02-222-222","R&D2");

        for (int i = 0 ; i<fcns; i++) {
            frns[i].showInfo();
            System.out.println();
        }
    }
}
