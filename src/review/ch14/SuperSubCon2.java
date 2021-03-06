package review.ch14;
class SuperCLS{
    public SuperCLS() {
        System.out.println("Con : SuperCLS()");
    }
    public SuperCLS(int i){
        System.out.println("Con: SuperCLS(int i)");
    }
    public SuperCLS(int i, int j){
        System.out.println("Con: SuperCLS(int i, int j)");
    }
}

class SubCLS extends SuperCLS{
    public SubCLS(){
        super();
        System.out.println("Con : SubCLS()");
    }
    public SubCLS(int i){
        super(i);
        System.out.println("Con: SubCLS(int i)");
    }
    public SubCLS(int i, int j){
        super(i,j);
        System.out.println("Cond: SubCLS(int i, int j)");
    }
}

public class SuperSubCon2 {
    public static void main(String[] args) {
        System.out.println("1");
        new SubCLS();
        System.out.println();

        System.out.println("2");
        new SubCLS(1);
        System.out.println();

        System.out.println("3");
        new SubCLS(1,2);
        System.out.println();
    }
}
