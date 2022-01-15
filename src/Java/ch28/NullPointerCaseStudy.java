package Java.ch28;

import java.util.Optional;

class Friend{   //친구 정보
    String name;
    Company cmp;        //null 일수 있음.

    public Friend(String n, Company c){
        name = n;
        cmp = c;
    }
    public String getName(){return name;}
    public Company getCmp(){return cmp;}
}

class Company{      //'친구 정보'에 속하는 '회사 정보'
    String cName;
    ContInfo cInfo;     //null일수 있음.

    public Company(String cn, ContInfo ci){
        cName = cn;
        cInfo = ci;
    }
    public String getCName(){return cName;}
    public ContInfo getCInfo(){return cInfo;}
}

class ContInfo{ //'회사 정보'에 속하는 '회사 연락처'
    String phone;   //null 일수 있음.
    String adrs;    //null 일수 있음.

    public ContInfo(String ph, String ad){
        phone = ph;
        adrs = ad;
    }
    public String getPhone(){return phone;}
    public String getAdrs(){return adrs;}
}
public class NullPointerCaseStudy {
    public static void showCompAddr(Optional<Friend> f){  //친구가 다니는 회사 주소 출력
        String addr = f.map(Friend::getCmp)
                        .map(Company::getCInfo)
                        .map(ContInfo::getAdrs)
                        .orElse("There's no address information");

        System.out.println(addr);
    }
    public static void main(String[] args) {
        ContInfo ci = new ContInfo("321-444-577", "Republic of Korea");
        Company cp = new Company("Yaho co., Ltd.",ci);
        Friend frn = new Friend("Lee Su", cp);
        showCompAddr(Optional.of(frn));  //친구가 다니는 회사의 주소 출력
    }
}
