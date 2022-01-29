package review.ch14;
class Man{
    private String name;

    public Man(String name){
        this.name = name;
    }
    public void tellYourName(){
        System.out.println("My name is " +name);
    }
}

class BusinessMan extends Man{
    String compnay;
    String position;
    public BusinessMan(String name, String company, String position){
        super(name);
        this.compnay = company;
        this.position = position;
    }

    public void tellYourInfo(){
        System.out.println("My company is "+compnay);
        System.out.println("My position is "+position);
        tellYourName(); //Man 클래스를 상속했기 때문에 호출 가능
    }
}
public class MyBusinessMan {
    public static void main(String[] args) {
        BusinessMan man = new BusinessMan("SEO","??","Staff");
        man.tellYourInfo();
    }
}
