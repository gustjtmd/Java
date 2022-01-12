package Java.ch25;

public class Varags {
    public static void showAll(String...vargs){
        System.out.println("LEN : " +vargs.length);

        for(String s : vargs)
            System.out.print(s +'\t');
        System.out.println();
    }
    public static void main(String[] args) {
        showAll("Box");
        showAll("Bx","Toy");
        showAll("Box","Toy","Appple");
    }
}
