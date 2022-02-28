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

    public static class StringArray {
        public static void main(String[] args) {
            String[] sr = new String[7];
            sr[0] = new String("Java");
            sr[1] = new String("System");
            sr[2] = new String("Complier");
            sr[3] = new String("Park");
            sr[4] = new String("Tree");
            sr[5] = new String("Dinner");
            sr[6] = new String("Brunch Cafe");

            int cnum = 0;
            for(int i = 0; i<sr.length;i++)
                cnum += sr[i].length();

            System.out.println("총 문자열의 수  : "+cnum);


        }
    }

    public static class TwoDimenArray {
        public static void main(String[] args) {
            int[][] arr = new int[3][4];
            int num = 1;

            //배열에 값을 저장
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 4; j++){
                    arr[i][j] = num;
                    num++;
                }
            }

            //배열에 저장된 값을 출력
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 4; j++){
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

    public static class TwoDimenArray2 {
        public static void main(String[] args) {
            int[][] arr = new int[3][4];
            int num = 1;

            for(int i = 0; i <arr.length;i++){
                for (int j = 0; j < arr[i].length; j++){
                    arr[i][j] = num;
                    num++;
                }
            }
            for(int i = 0; i< arr.length;i++){
                for(int j = 0; j < arr[i].length; j++){
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
public class MyBusinessMan {
    public static void main(String[] args) {
        BusinessMan man = new BusinessMan("SEO","??","Staff");
        man.tellYourInfo();
    }
}
