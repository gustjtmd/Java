package Java.ch25;

public class VaragsBefore {
    public static void showALl(String[] vargs){
        System.out.println("LEN: "+vargs.length);

        for(String s : vargs)
            System.out.print(s + '\t');
        System.out.println();
    }
    public static void main(String[] args) {
        showALl(new String[]{"Box"});
        showALl(new String[]{"Box","Toy"});
        showALl(new String[]{"Box", "Toy", "Apple"});
    }
}
