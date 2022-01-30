package review.ch16;

class UnivFriend2{   //대학 동창
    private String name;
    private String major;   //전공
    private String phone;

    public UnivFriend2(String name, String major, String phone) {
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    public void showInfo(){
        System.out.println("이름 : "+name);
        System.out.println("전공 : "+major);
        System.out.println("전화 : "+phone);
    }
}

class CompFriend2{   //직장 동료
    private String name;
    private String department;  //부서
    private String phone;

    public CompFriend2(String name, String department, String phone) {
        this.name = name;
        this.department = department;
        this.phone = phone;
    }
    public void showInfo(){
        System.out.println("이름 : "+name);
        System.out.println("부서 : "+department);
        System.out.println("전화 : "+phone);
    }
}

public class MyFriends {
    public static void main(String[] args) {
        //대학 동창의 관리를 위한 배열과 변수
        UnivFriend2[] ufrns = new UnivFriend2[5];
        int unct = 0;

        //직장 동료의 관리를 위한 배열과 변수
        CompFriend2[] cfrns = new CompFriend2[5];
        int ccnt = 0;

        //대학 동창의 정보 저장
        ufrns[unct++] = new UnivFriend2("Lee","Computer","010-111-111");
        ufrns[unct++] = new UnivFriend2("Seo","Electronics","010-222-222");

        //직장 동료의 정보 저장
        cfrns[ccnt++] = new CompFriend2("YOON","R&D1","02-111-111");
        cfrns[ccnt++] = new CompFriend2("PARK","R&D2","02-222-222");

        //모든 동창 및 동료의 정보 전체 출력
        for(int i = 0; i<unct;i++) {
            ufrns[i].showInfo();
            System.out.println();
        }
        System.out.println("====================================================\n");
        for(int i = 0; i<ccnt;i++){
            cfrns[i].showInfo();
            System.out.println();
        }
    }
}
