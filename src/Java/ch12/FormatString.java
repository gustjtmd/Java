package Java.ch12;
/*
    System.out.printf("정수는 %d, 실수는 %f, 문자는 %c", 12, 24.5, 'A');
 */
public class FormatString {
    public static void main(String[] args) {
        int age = 20;
        double height = 178.2;
        String name = "Seo Seoung Hyun";

        System.out.printf("name : %s \n",name);
        System.out.printf("age : %d\n height : %e \n\n", age, height);

        System.out.printf("%d - %d - %x \n\n", 77, 77, 77);
        System.out.printf("%g\n",0.00014);
        System.out.printf("%g\n",0.000014);
    }
}
