package review;
class Business implements Cloneable{
    private String company;
    private String work;
    public Business(String company, String work){
        this.company = company;
        this.work = work;
    }
    public void showBusinessInfo(){
        System.out.println("회사 :" +company);
        System.out.println("업무 : "+work);
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class PersonalInfo implements Cloneable{
    private String name;
    private int age;
    private Business bz;
    public PersonalInfo(String name, int age, String company, String work){
        this.name = name;
        this.age = age;
        bz = new Business(company, work);
    }
    public void showPersonalInfo(){
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
        bz.showBusinessInfo();
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        PersonalInfo cpy = (PersonalInfo) super.clone();
        cpy.bz = (Business) bz.clone();
        return cpy;
    }
}

public class CloneTest {
    public static void main(String[] args) {
        try {
            PersonalInfo org =
                    new PersonalInfo("James", 22, "SimpeSound", "encoding");

            PersonalInfo cpy = (PersonalInfo) org.clone();


            org.showPersonalInfo();
            cpy.showPersonalInfo();
        }
        catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
