package Test;

class Toy10{}

class Car10 extends Toy10{}

public class Test {
    public static void main(String[] args) {
        Toy10 toy10 = new Car10();
  //      Car10 car10 = new Toy10();

        System.out.println(toy10);
    }
}
